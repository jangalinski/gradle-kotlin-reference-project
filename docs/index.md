# Kotlin Gradle Refarch

## Basics

* we use gradle (no maven, ant, ...)
* we use kotlin (wherever possible)
* we use the gradle kotlin dsl (`*.kts`)
* we use Intellij IDEA (do not expect eclipse sepcigic config)
* we build self contained, executable applications (no JEE app server, war support, ...)

## Versions

* gradle version 4.10.2
* kotlin version 1.2.71

## Layout

```asciidoc
buildSrc/
backend/
frontent/
gradle/

```
