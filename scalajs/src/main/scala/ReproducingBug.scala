import scala.scalajs.js.annotation.{JSExportNamed, JSExport}

@JSExport("ReproducingBug")
object ReproducingBug {

  @JSExportNamed
  def main(foo: String, bar: Boolean = false): Unit = {
    println("Hello, World!")
  }
}
