name := "selenium-primetime"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.53.1"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-chrome-driver" % "2.35.1"

mainClass in assembly := some("com.example.Main")
assemblyJarName := "selenium-primetime.jar"
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}