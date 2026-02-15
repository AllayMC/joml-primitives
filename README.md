# JOML Primitives

![Maven Central Version](https://img.shields.io/maven-central/v/org.allaymc/joml-primitives?label=joml-primitives&link=https%3A%2F%2Fcentral.sonatype.com%2Fartifact%2Forg.allaymc%2Fjoml-primitives)

A fork of https://github.com/JOML-CI/joml-primitives used in AllayMC.

## Features

- Java version is upgraded to 21
- Build system is migrated to Gradle
- Introduced read-only interfaces for primitive classes:
  - Circled
  - Circlef
  - LineSegmentd
  - LineSegmentf
  - Planed
  - Planef
  - Rayd
  - Rayf
  - Rectangled
  - Rectanglef
  - Rectanglei
  - Sphered
  - Spheref
- Fixed AABBdc#intersectsAABB method which uses AABBd instead of AABBdc unexpectedly

## Dependency

### Gradle (Kotlin DSL)

```kt
repositories {
    mavenCentral()
}

implementation("org.allaymc:joml-primitives:1.11.1")
```