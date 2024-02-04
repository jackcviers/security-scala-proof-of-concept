import mill._
import mill.scalalib._

// import $ivy.`io.chris-kipp:mill-github-dependency-graph_mill0.11_2.13:0.2.6`

object securityscalaproofofconcept extends ScalaModule {

  def scalaVersion = "2.13.12"

  def ivyDeps = Agg(
      ivy"ch.qos.logback:logback-classic:1.4.7",
      ivy"ch.qos.logback:logback-core:1.4.7",
      ivy"co.fs2::fs2-core:3.7.0",
      ivy"co.fs2::fs2-io:3.7.0",
      ivy"com.chuusai::shapeless:2.3.10",
      ivy"com.chuusai::shapeless:2.3.10",
      ivy"com.comcast::ip4s-core:3.3.0",
      ivy"com.github.pureconfig::pureconfig-core:0.17.4",
      ivy"com.github.pureconfig::pureconfig-generic:0.17.4",
      ivy"com.github.pureconfig::pureconfig:0.17.4",
      ivy"com.github.yakivy::dupin-core:0.6.0",
      ivy"com.github.yakivy::jam-cats:0.4.3",
      ivy"com.github.yakivy::jam-monad:0.4.3",
      ivy"com.github.yakivy::poppet-circe:0.3.5",
      ivy"com.github.yakivy::poppet-core:0.3.5",
      ivy"com.typesafe:config:1.4.2",
      ivy"io.circe::circe-core:0.14.6",
      ivy"io.circe::circe-generic:0.14.6",
      ivy"io.circe::circe-jawn:0.14.6",
      ivy"io.circe::circe-numbers:0.14.6",
      ivy"io.circe::circe-parser:0.14.6",
      ivy"io.circe::circe-shapes:0.14.6",
      ivy"net.bytebuddy:byte-buddy-agent:1.12.19",
      ivy"net.bytebuddy:byte-buddy:1.12.19",
      ivy"net.logstash.logback:logstash-logback-encoder:6.0",
      ivy"org.scala-lang.modules::scala-java8-compat:1.0.2",
      ivy"org.scala-lang:scala-library:2.13.11",
      ivy"org.scala-lang:scala-reflect:2.13.11",
      ivy"org.typelevel::alleycats-core:2.8.0",
      ivy"org.typelevel::cats-core:2.9.0",
      ivy"org.typelevel::cats-effect-kernel:3.5.0",
      ivy"org.typelevel::cats-effect:3.5.0",
      ivy"org.typelevel::kittens:3.0.0",
      ivy"org.typelevel::log4cats-core:2.6.0"
    )

  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit:0.7.29",
      ivy"org.scalatest::scalatest-core:3.2.15",
      ivy"org.scalatest::scalatest-diagrams:3.2.15",
      ivy"org.scalatest::scalatest-featurespec:3.2.15",
      ivy"org.scalatest::scalatest-flatspec:3.2.15",
      ivy"org.scalatest::scalatest-freespec:3.2.15",
      ivy"org.scalatest::scalatest-funspec:3.2.15",
      ivy"org.scalatest::scalatest-funsuite:3.2.15",
      ivy"org.scalatest::scalatest-matchers-core:3.2.15",
      ivy"org.scalatest::scalatest-mustmatchers:3.2.15",
      ivy"org.scalatest::scalatest-propspec:3.2.15",
      ivy"org.scalatest::scalatest-refspec:3.2.15",
      ivy"org.scalatest::scalatest-shouldmatchers:3.2.15"

    )
    
  }
}
