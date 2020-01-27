plugins {
  `java-library`
}

dependencies {
  api(project(":producer"))

  api("org.apache.thrift:libthrift") {
    version {
      strictly("0.9.3-1")
    }
  }
}
