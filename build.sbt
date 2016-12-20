name := "mockup"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.projectlombok" % "lombok" % "1.16.12"
)



fork in run := false