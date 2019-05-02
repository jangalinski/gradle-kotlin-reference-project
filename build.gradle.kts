plugins {
  base
  idea
}

allprojects {
  group = "com.github.jangalinski.refarch"
  version = "0.0.1-SNAPSHOT"

  apply {
    from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
  }
}

// TODO: document: why do we need this?
dependencies {
  subprojects.forEach {
    archives(it)
  }
}
