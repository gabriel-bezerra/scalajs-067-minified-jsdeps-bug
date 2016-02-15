lazy val commonSettings = Seq(
    name := "ReproducingBug",
    version := "0.0.0-SNAPSHOT",
    scalaVersion := "2.11.7",
    scalacOptions ++= Seq(
      "-feature",
      "-Xlint",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )

commonSettings

lazy val scalajs = project.in(file("scalajs"))
  .settings(commonSettings: _*)
