name := """play3-sbt2-seed"""
organization := "com.example"
version := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.10.0"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    PlayKeys.playDefaultPort := 8888,
    libraryDependencies ++= AppDependencies.appDependencies
  )

excludeDependencies ++= Seq(
  "org.typelevel"          % "cats-kernel_2.13",
  "org.typelevel"          % "cats-core_2.13",
  "org.scala-lang.modules" % "scala-parser-combinators_2.13"
)

resolvers ++= Seq(
  Resolver.sonatypeCentralSnapshots,
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeIvyRepo("releases"),
  MavenRepository("HMRC-open-artefacts-maven2", "https://open.artefacts.tax.service.gov.uk/maven2"),
  "HMRC-open-artefacts-ivy2" at "https://open.artefacts.tax.service.gov.uk/ivy2"
)

addCommandAlias("precommit", "clean;coverage;test;coverageOff;coverageReport;package")
addCommandAlias("testCoverage", "clean;coverage;test;coverageOff;coverageReport;coverageAggregate;package")
