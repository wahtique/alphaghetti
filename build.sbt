val scala2Version               = "2.13.8"
val scala3Version               = "3.2.0"
lazy val supportedScalaVersions = List(scala2Version, scala3Version)

ThisBuild / organization := "io.github.wahtique"

ThisBuild / version       := "0.1.0"
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / licenses := Seq("Apache License v2" -> url("https://apache.org/licenses/LICENSE-2.0.html"))

ThisBuild / scalaVersion := scala3Version

ThisBuild / crossScalaVersions := supportedScalaVersions

ThisBuild / scalafmtAll       := true
ThisBuild / scalafmtOnCompile := true

lazy val tests = Seq("org.scalameta" %% "munit" % "0.7.29").map(_ % Test)

lazy val alphaghettiDeps = tests

lazy val lib = project
  .in(file("."))
  .settings(
    name := "alphaghetti",
    libraryDependencies ++= alphaghettiDeps
  )
