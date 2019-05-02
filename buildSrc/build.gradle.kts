import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  `kotlin-dsl`
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}

apply {
  // repos set in /gradle
  from("../gradle/repositories.gradle.kts")
}