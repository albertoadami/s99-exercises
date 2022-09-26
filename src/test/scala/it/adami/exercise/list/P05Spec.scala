package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P05Spec extends SpecBase {

  "P05" should {
    "return the reversed list" in {
      P05.reverse(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
      P05.reverse(List(1, 2, 4, 5)) shouldBe List(5, 4, 2, 1)
      P05.reverse(List(5)) shouldBe List(5)
      P05.reverse(List[Int]()) shouldBe List[Int]()


      P05.reverseTail(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
      P05.reverseTail(List(1, 2, 4, 5)) shouldBe List(5, 4, 2, 1)
      P05.reverseTail(List(5)) shouldBe List(5)
      P05.reverseTail(List[Int]()) shouldBe List[Int]()
    }

  }


}
