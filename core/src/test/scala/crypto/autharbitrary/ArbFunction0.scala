//: ----------------------------------------------------------------------------
//: Copyright (C) 2017 Verizon.  All Rights Reserved.
//:
//:   Licensed under the Apache License, Version 2.0 (the "License");
//:   you may not use this file except in compliance with the License.
//:   You may obtain a copy of the License at
//:
//:       http://www.apache.org/licenses/LICENSE-2.0
//:
//:   Unless required by applicable law or agreed to in writing, software
//:   distributed under the License is distributed on an "AS IS" BASIS,
//:   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//:   See the License for the specific language governing permissions and
//:   limitations under the License.
//:
//: ----------------------------------------------------------------------------
package nelson
package crypto
package autharbitrary

import org.scalacheck._
import scalaz.scalacheck.ScalaCheckBinding._
import scalaz.syntax.functor._

object ArbFunction0 {
  /** This is available in more recent versions of scalacheck. */
  implicit def arbitraryFunction0[A](implicit arbA: Arbitrary[A]): Arbitrary[() => A] =
    arbA.map(() => _)
}
