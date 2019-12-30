import org.scalatest._
import chisel3._
import chisel3.tester._

class BlinkyTest  extends FlatSpec with ChiselScalatestTester with Matchers {
  behavior of classOf[Blinky].toString()

  it should "blink" in {
    test(new Blinky(10)) { b =>
      b.io.led.expect(0.U)
      b.clock.step(10)
      b.io.led.expect(1.U)
      b.clock.step(10)
      b.io.led.expect(0.U)
    }
  }

  it should "not blink during reset" in {
    test(new Blinky(10)) { b =>
      b.reset.poke(true.B)
      b.io.led.expect(0.U)
      b.clock.step(10)
      b.io.led.expect(0.U)
      b.clock.step(10)
      b.io.led.expect(0.U)
    }
  }
}
