import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version embeddedKotlinVersion apply false
}

subprojects {
  apply {
    plugin("kotlin")
  }


  dependencies {


   // compile(kotlin("stdlib-jdk8"))
   // compile(kotlin("reflect"))
  }


  tasks.withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = Versions.java
      //  freeCompilerArgs = kotlin.collections.listOf("-Xjsr305=strict")
    }
  }
}
