name := "dockerized_scala_playground"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

mainClass in (Compile, run) := Some("scf.main.Main")

mainClass in (Compile, packageBin) := Some("scf.main.Main")