package com.ind.clasp

import org.scalatest.FunSpec

class ClaspSpec extends FunSpec {
  trait Channel[T] {

  }

  class EmptyChannel[T] extends Channel[T] {

  }

  def go[T](f: => T): Channel[T] = {
    new EmptyChannel()
  }

  it("works") {
    go {
      
    }
  }
}
