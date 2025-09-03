import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import number.Numbers
import operators.Operators

suspend fun printMessage(message: String) {
    delay(5000L)
    println(message)
}

fun main() = runBlocking {

    val math = Numbers()
    val num1 = math.createNumbers(1, 10)
    val num2 = math.createNumbers(1, 10)

    val op = Operators()

    var i = 0
    while (true) {

        val type = launch {
            suspend{printMessage("| Welcome to: Math Problem Solver |")}
        }

        type.join()
        i += 1
        if (op.createOperators() == "+") {

            println("What is: $num1 + $num2")
            println("Enter Answer: ")
            val result = readln().toInt()

            if (result == num1 + num2) {

                println("Correct: $num1 + $num2 = ${num1 + num2}")

                break
            }

        }

        if (op.createOperators() == "-") {

            println("What is: $num1 - $num2")
            println("Enter Answer: ")

            val result = readln().toInt()

            if (result == num1 - num2) {

                println("Correct: $num1 - $num2 = ${num1 - num2}")
                break
            }

        }

        if (op.createOperators() == "*s") {

            println("What is: $num1 * $num2")
            println("Enter Answer: ")

            val result = readln().toInt()

            if (result == num1 * num2) {

                println("Correct: $num1 * $num2 = ${num1 * num2}")
                break
            }

        }
    }
}