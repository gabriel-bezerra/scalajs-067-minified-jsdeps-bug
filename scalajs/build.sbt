enablePlugins(ScalaJSPlugin)

skip in packageJSDependencies := false

relativeSourceMaps := true

jsDependencies in Test += RuntimeDOM

jsDependencies += "org.webjars" % "zeroclipboard" % "2.2.0" / "ZeroClipboard.js" minified "ZeroClipboard.min.js"
