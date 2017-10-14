import scala.concurrent.Future
import scala.concurrent.duration._
import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable.Specification

class AsyncSpec(implicit ee: ExecutionEnv) extends Specification {

  "Future matchers" should {
    "work" in {
      val result = Future.successful("1")

      result must beEqualTo("1").awaitFor(10.seconds)
    }

    "work with 2 examples" in {
      val result = Future.successful("2")

      result must beEqualTo("2").awaitFor(10.seconds)
    }
  }
}
