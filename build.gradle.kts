plugins {
  base
  idea
}

allprojects {
  group = "com.github.jangalinski"
  version = "0.0.1-SNAPSHOT"

  repositories {
    mavenLocal()
    jcenter()
  }
}

dependencies {
  subprojects.forEach {
    archives(it)
  }
}
