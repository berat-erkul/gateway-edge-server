#!/bin/bash
# Bu proje için Java 11 (Homebrew OpenJDK) kullanır.
# Kullanım: source setup-java11.sh   (sonra mvn spring-boot:run)

if command -v brew >/dev/null 2>&1; then
  JAVA11_HOME="$(brew --prefix openjdk@11 2>/dev/null)"
  if [ -n "$JAVA11_HOME" ] && [ -d "$JAVA11_HOME" ]; then
    export JAVA_HOME="$JAVA11_HOME"
    export PATH="$JAVA_HOME/bin:$PATH"
    echo "✅ Java 11 (Homebrew openjdk@11) kullanılıyor: $JAVA_HOME"
    java -version
    exit 0
  fi
fi

# Fallback: sistemdeki Java 11
if [ -x "/usr/libexec/java_home" ]; then
  JAVA11_HOME="$(/usr/libexec/java_home -v 11 2>/dev/null)"
  if [ -n "$JAVA11_HOME" ]; then
    export JAVA_HOME="$JAVA11_HOME"
    export PATH="$JAVA_HOME/bin:$PATH"
    echo "✅ Java 11 (sistem) kullanılıyor: $JAVA_HOME"
    java -version
    exit 0
  fi
fi

echo "❌ Java 11 bulunamadı. Kurulum: brew install openjdk@11"
exit 1

