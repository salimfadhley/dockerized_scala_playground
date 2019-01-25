package scf

import org.scalatest.{FlatSpec, Matchers}

class FooSpec extends FlatSpec with Matchers {

  "Foo" should "initializable" in {
    val f:Foo = new Foo(phrase="Hello World")
  }


}
