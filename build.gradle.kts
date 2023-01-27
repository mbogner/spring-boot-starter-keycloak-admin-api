plugins {
    // https://plugins.gradle.org/plugin/io.spring.dependency-management
    id("io.spring.dependency-management") version "1.1.0"
    id("java-library")
}

group = "dev.mbo"
version = "1.0-SNAPSHOT"

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