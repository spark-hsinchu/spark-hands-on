import sbt.Keys._

name := "wordcount"
version := "1.0.1"
scalaVersion := "2.10.5"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2"
)
