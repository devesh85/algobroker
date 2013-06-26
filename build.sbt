name:="broker"

scalaVersion := "2.10.1"

version := "0.1"

resolvers += "QuickFixJ Repository" at "http://repo.marketcetera.org/maven"

libraryDependencies += "quickfixj" % "quickfixj-all" % "1.5.2-bd"


libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"
