#!/bin/bash
###############################################################################
# update-api.sh
#
# Simple script to update the src/main/javaGen folder based on the openapi
# specification.
#
# This script uses docker image openapitools/openapi-generator-cli to generate
# above mentioned folder which can then be archived in git instead of just
# having it dynamically built in the build directory.
#
# Using the gradle plugin failed because it didn't pick up the template folder
# properly.
###############################################################################

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" >/dev/null 2>&1 && pwd)"
PROJECT_DIR=$(cd "$DIR"/../../.. && pwd)
BASE_PKG=dev.mbo.keycloak.admin
BASE_PKG_DIR=dev/mbo/keycloak/admin
JAVA_SRC_DIR=src/main/java
JAVA_GEN_DIR=${JAVA_SRC_DIR}Gen
OPENAPI_DIR=src/main/openapi

echo "# DIR: $DIR"
echo "# PROJECT_DIR: $PROJECT_DIR"
echo "# BASE_PKG: $BASE_PKG"
echo "# BASE_PKG_DIR: $BASE_PKG_DIR"
echo "# JAVA_SRC_DIR: $JAVA_SRC_DIR"
echo "# JAVA_GEN_DIR: $JAVA_GEN_DIR"
echo "# OPENAPI_DIR: $OPENAPI_DIR"

#################################################

echo "# run generate in docker - output written to $DIR/build"
cd "${DIR}" || exit 1
rm -rf "./build"
mkdir -p "./build"

docker run --rm \
  -v "$DIR"/spec:/local/spec:ro \
  -v "$DIR"/config:/local/config:ro \
  -v "$DIR"/templates:/local/templates:ro \
  -v "$DIR/build":/local/build:rw \
  openapitools/openapi-generator-cli generate \
  -i /local/spec/20.0.3.yml \
  -g java \
  --library webclient \
  -t /local/templates/java \
  --config /local/config/config.json \
  --model-name-suffix Dto \
  --package-name ${BASE_PKG} \
  --api-package ${BASE_PKG}.api \
  --model-package ${BASE_PKG}.api.dto \
  --invoker-package ${BASE_PKG}.api.client \
  --import-mappings Instant=java.time.Instant \
  --type-mappings DateTime=Instant \
  -o "/local/build"

#################################################

echo "# replacing old files with content from build dir and cleaning up"
cd "$PROJECT_DIR" || exit 1
rm -rf ${JAVA_GEN_DIR}/${BASE_PKG_DIR}/api
mkdir -p ${JAVA_GEN_DIR}/${BASE_PKG_DIR}
mv ${OPENAPI_DIR}/build/${JAVA_SRC_DIR}/${BASE_PKG_DIR}/api ${JAVA_GEN_DIR}/${BASE_PKG_DIR}
rm -r ${OPENAPI_DIR}/build
