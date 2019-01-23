name := "dockerized_scala_playground"

version := "0.1"

scalaVersion := "2.12.8"

mainClass in (Compile, run) := Some("main.Main")

mainClass in (Compile, packageBin) := Some("main.Main")