#!/bin/bash
# Bu proje için Java 11'e geçiş script'i
# Kullanım: source setup-java11.sh

export JAVA_HOME=/Library/Java/JavaVirtualMachines/microsoft-11.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH

echo "✅ Java 11'e geçildi!"
echo "Java version:"
java -version
echo ""
echo "Maven version:"
mvn -version | grep "Java version"

