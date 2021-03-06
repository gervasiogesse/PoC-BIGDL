name := "poc-bigdl"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.intel.analytics.bigdl" % "bigdl-SPARK_2.4" % "0.10.0",
//  "com.intel.analytics.bigdl" % "bigdl-SPARK_2.4" % "0.10.0" % "provided",
  // Last stable release
//  "org.scalanlp" %% "breeze" % "0.13.1",
  // Native libraries are not included by default. add this if you want them (as of 0.7)
  // Native libraries greatly improve performance, but increase jar sizes.
  // It also packages various blas implementations, which have licenses that may or may not
  // be compatible with the Apache License. No GPL code, as best I know.
//  "org.scalanlp" %% "breeze-natives" % "0.13.1",
  "org.apache.spark" %% "spark-core" % "2.4.5",
  "org.apache.spark" %% "spark-mllib" % "2.4.5",
  "org.apache.spark" %% "spark-sql" % "2.4.5"
//      "org.apache.spark" %% "spark-core" % "2.4.5" % "provided",
//      "org.apache.spark" %% "spark-mllib" % "2.4.5" % "provided",
//      "org.apache.spark" %% "spark-sql" % "2.4.5" % "provided"
)