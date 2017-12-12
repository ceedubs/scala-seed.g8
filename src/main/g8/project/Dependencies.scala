import sbt._

object dependencies {
  object cats {
    val version = "1.0.0-RC1"
    val org = "org.typelevel"

    val core = org %% "cats-core" % version
    val testkit = org %% "cats-testkit" % version
  }
}
