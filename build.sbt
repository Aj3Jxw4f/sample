lazy val commonSettings = Seq(
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val foo = (project in file("foo"))
  .enablePlugins(PlayJava)
  .settings(commonSettings: _*)
  .settings(
    name := "foo"
  )

lazy val bar = (project in file("bar"))
  .enablePlugins(PlayJava)
  .dependsOn(foo)
  .settings(commonSettings: _*)
  .settings(
    name := "bar"
  )

lazy val root = (project in file("."))
  .aggregate(foo, bar)
  .settings(commonSettings: _*)
  .settings(
    name := "sample"
  )
