plugins {
    // https://plugins.gradle.org/plugin/io.spring.dependency-management
    id("io.spring.dependency-management") version "1.1.0"
    id("java-library")
    id("signing")
    id("maven-publish")
}

group = "dev.mbo"

dependencies {
    api("org.springframework.boot:spring-boot-starter-webflux")
    api("org.springframework.boot:spring-boot-starter-json")
    api("org.springframework.boot:spring-boot-starter-validation")
    // https://mvnrepository.com/artifact/org.openapitools/jackson-databind-nullable
    api("org.openapitools:jackson-databind-nullable:0.2.4")
    api("org.apache.commons:commons-lang3")

    api("org.springframework.boot:spring-boot-starter-security")
    api("org.springframework.security:spring-security-oauth2-client")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    resolutionStrategy {
        cacheChangingModulesFor(0, "seconds")
    }
    imports {
        // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.0.2")
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    test {
        useJUnitPlatform()
    }

    withType<Copy> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    withType<Wrapper> {
        // https://gradle.org/releases/
        gradleVersion = "7.6"
        distributionType = Wrapper.DistributionType.BIN
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src/main/javaGen")
        }
    }
}

// ----------------------------------------------------------------
// Publication
// ----------------------------------------------------------------

publishing {
    repositories {

        maven {
            //val releasesRepoUrl = "https://s01.oss.sonatype.org/content/repositories/releases"
            val releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots"
            val deployTo = uri(if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl)
            url = deployTo
            println("deploying $version to $deployTo")
            credentials {
                username = project.properties["ossrhUsername"] as String? ?: "Unknown user"
                password = project.properties["ossrhPassword"] as String? ?: "Unknown user"
            }
        }

    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "dev.mbo"
            artifactId = "spring-boot-starter-keycloak-admin-api"
            version = version.toString()

            from(components["java"])

            pom {
                name.set("spring-boot-starter-keycloak-admin-api")
                description.set("Keycloak Admin API client for Spring Boot 3")
                url.set("https://github.com/mbogner/spring-boot-starter-keycloak-admin-api")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("mbo")
                        name.set("Manuel Bogner")
                        email.set("outrage_breath.0t@icloud.com")
                        organization.set("mbo.dev")
                        organizationUrl.set("https://mbo.dev")
                        timezone.set("Europe/Vienna")
                        roles.set(setOf("architect", "developer"))
                    }
                }
                organization {
                    name.set("mbo.dev")
                    url.set("https://mbo.dev")
                }
                scm {
                    connection.set("git@github.com:mbogner/spring-boot-starter-keycloak-admin-api.git")
                    developerConnection.set("git@github.com:mbogner/spring-boot-starter-keycloak-admin-api.git")
                    url.set("https://github.com/mbogner/spring-boot-starter-keycloak-admin-api")
                }
            }
        }
    }
}

signing {
    sign(publishing.publications["maven"])
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}