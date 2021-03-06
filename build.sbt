name := "scala-type-classes"

version := "0.1.5"

scalaVersion := "2.13.4"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.4.2"

// publish

usePgpKeyHex("59934C580565D7C358C3AB8C62DD7D28B3D79883")

ThisBuild / organization := "io.github.aksharp"
ThisBuild / organizationName := "aksharp"
ThisBuild / organizationHomepage := Some(url("http://github.com/aksharp"))

ThisBuild / crossScalaVersions in ThisBuild := Seq("2.12.11", "2.13.4")

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/aksharp/scala-type-classes"),
    "scm:git@github.com:aksharp/scala-type-classes.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "aksharp",
    name  = "Alexander Khotyanov",
    email = "alex@khotyanov.com",
    url   = url("https://github.com/aksharp")
  )
)

ThisBuild / description := "Scala type classes."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/aksharp/scala-type-classes"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

