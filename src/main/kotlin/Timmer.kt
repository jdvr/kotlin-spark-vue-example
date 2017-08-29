import spark.Request
import spark.Response
import spark.Spark.*

fun main(args: Array<String>) {
    staticFiles.location("/static")

    val helloHandler: (Request, Response) -> String = { req, res -> "Hello World" }

    get("/hello", helloHandler)
}