sbtPlugin := true

organization := "com.github.dwhjames"

name := "sbt-awseb"

version := "0.2.1"

description := "SBT plugin for Amazon Web Services Elastic Beanstalk"

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github/dwhjames/sbt-awseb"))

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.7.13"

publishMavenStyle := true

publishArtifact in (Compile, packageDoc) := false

publishTo := Some("Artifactory Realm" at "http://zulli.artifactoryonline.com/zulli/plugins-snapshots-local")
credentials += Credentials("Artifactory Realm", "zulli.artifactoryonline.com", "firecrackler", "op9Not7i")
