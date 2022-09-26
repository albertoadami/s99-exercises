package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P04Spec extends SpecBase {

  "P04" should {
    "return the lenght of the list" in {
      P04.length(List(1, 2, 3, 4, 5)) shouldBe 5
      P04.length(List(1, 2, 4, 5)) shouldBe 4
      P04.length(List(5)) shouldBe 1
      P04.length(List[Int]()) shouldBe 0

      P04.lengthTail(List(1, 2, 3, 4, 5)) shouldBe 5
      P04.lengthTail(List(1, 2, 4, 5)) shouldBe 4
      P04.lengthTail(List(5)) shouldBe 1
      P04.lengthTail(List[Int]()) shouldBe 0
    }

  }


}
