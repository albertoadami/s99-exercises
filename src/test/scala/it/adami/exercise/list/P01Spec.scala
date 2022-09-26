package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P01Spec extends SpecBase {

  "P01" should {
    "return the last element of the list" in {
      P01.last(List(1, 2, 3, 4, 5)) shouldBe 5
      P01.last(List(1, 3, 4)) shouldBe 4
      P01.last(List(1)) shouldBe 1
      the [NoSuchElementException] thrownBy P01.last(List[Int]())
    }

  }


}
