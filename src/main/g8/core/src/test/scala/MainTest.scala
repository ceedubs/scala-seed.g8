package $org$

import cats.tests.CatsSuite

class MainTest extends CatsSuite {
  test("addition associativity") {
    forAll { (x: Int, y: Int, z: Int) =>
      (x + (y + z)) should ===((x + y) + z)
    }
  }
}
