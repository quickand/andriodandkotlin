Install kotlin
==============

cd Projects/
mkdir kotlin
cd kotlin
vi hello.kt

fun main(args: Array<String>) {
    println("Hello, World!")
}

<Install Java SDK>

# Compile
kotlinc hello.kt -include-runtime -d hello.jar

# compiler help
kotlinc -help

# Run
java -jar hello.jar

-- UI change --
