package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P15Spec extends SpecBase {

  "P15" should {
    "duplicateN a List" in {
      P15.duplicateN(3, List(1)) shouldBe (List(1, 1, 1))
      P15.duplicateN(4, List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
      P15.duplicateN(2, List(1, 1, 1, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)

      P15.duplicateNTail(3, List(1)) shouldBe (List(1, 1, 1))
      P15.duplicateNTail(4, List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
      P15.duplicateNTail(2, List(1, 1, 1, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)

      P15.duplicateFunctional(3, List(1)) shouldBe (List(1, 1, 1))
      P15.duplicateFunctional(4, List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
      P15.duplicateFunctional(2, List(1, 1, 1, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)


    }

  }


}
