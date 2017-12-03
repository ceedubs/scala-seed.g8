import dependencies._

scalaVersion in ThisBuild := "$scala_version$"

organization in ThisBuild := "$org$"

version in ThisBuild := "0.1.0-SNAPSHOT"

lazy val core = (project in file("core"))
  .settings(
    moduleName := "core",
    libraryDependencies += cats.core)

lazy val root = project
  .settings(
    moduleName := "root"
  ).aggregate(core)
