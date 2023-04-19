#! /bin/bash
echo "Starting Learner Products API"
cd /opt/learner
exec java ${JAVA_OPTS} -jar ./*.jar