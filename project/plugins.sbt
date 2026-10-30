resolvers ++= Seq(
  Resolver.sbtPluginRepo("releases")
)

addSbtPlugin("org.playframework" % "sbt-plugin"    % "3.1.0-M9")
addSbtPlugin("org.scoverage"     % "sbt-scoverage" % "2.4.4")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"  % "2.6.2")
addSbtPlugin("ch.epfl.scala"     % "sbt-scalafix"  % "0.14.9")
