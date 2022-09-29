package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P14Spec extends SpecBase {

  "P14" should {
    "duplicate a List" in {
      P14.duplicate(List(1)) shouldBe (List(1, 1))
      P14.duplicate(List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1)
      P14.duplicate(List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)

      P14.duplicateTail(List(1)) shouldBe (List(1, 1))
      P14.duplicateTail(List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1)
      P14.duplicateTail(List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)

      P14.duplicateFunctional(List(1)) shouldBe (List(1, 1))
      P14.duplicateFunctional(List(1, 1, 1)) shouldBe List(1, 1, 1, 1, 1, 1)
      P14.duplicateFunctional(List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)) shouldBe List(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 4, 4, 7, 7, 7, 7)


    }

  }


}
