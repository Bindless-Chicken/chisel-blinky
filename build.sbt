
scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)
val defaultVersions = Map(
  "chisel3" -> "3.2.+",
  "chisel-testers2" -> "0.1.+"
)

libraryDependencies ++= Seq("chisel3", "chisel-testers2").map {
  dep: String => "edu.berkeley.cs" %% dep % sys.props.getOrElse(dep + "Version", defaultVersions(dep)) }