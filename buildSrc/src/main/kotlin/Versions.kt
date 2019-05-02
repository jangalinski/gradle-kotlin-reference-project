import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.embeddedKotlinVersion

object Versions {
  val java = JavaVersion.VERSION_1_8.toString()
  val kotlin = embeddedKotlinVersion

  val springBoot = "2.1.4.RELEASE"
}
