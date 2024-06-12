scalaVersion := "2.13.12"

import smithy4s.codegen.Smithy4sCodegenPlugin
enablePlugins(Smithy4sCodegenPlugin)
Compile / smithy4sAllDependenciesAsJars := Nil
