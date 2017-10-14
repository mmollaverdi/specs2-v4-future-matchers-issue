import scala.concurrent.Future
import scala.concurrent.duration._
import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable.Specification

class Async2Spec(implicit ee: ExecutionEnv) extends Specification {

  "Future matchers" should {
    "work" in {
      val result = Future.successful("1")

      result must beEqualTo("1").awaitFor(10.seconds)
    }
  }
}

