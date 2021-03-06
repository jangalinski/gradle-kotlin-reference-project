import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version Versions.kotlin
  kotlin("plugin.spring") version Versions.kotlin
  id("org.springframework.boot") version Versions.springBoot
}

dependencies {
  compile("org.springframework.boot:spring-boot-starter:${Versions.springBoot}")

  compile(project(":backend:game"))

  compile(kotlin("stdlib-jdk8"))
  compile(kotlin("reflect"))
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    //  freeCompilerArgs = kotlin.collections.listOf("-Xjsr305=strict")
  }
}