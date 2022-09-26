package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P03Spec extends SpecBase {

  "P03" should {
    "return the nth element of the list" in {
      P03.nth(2, List(1, 2, 3, 4, 5)) shouldBe 3
      P03.nth(0, List(1, 2, 3, 4, 5)) shouldBe 1
      P03.nth(4, List(1, 2, 3, 4, 5)) shouldBe 5
      the [NoSuchElementException] thrownBy P03.nth(2, List[Int](1))
      the [NoSuchElementException] thrownBy P03.nth(0, List[Int]())
    }

  }


}
