import kotlinx.coroutines.runBlocking
import number.Numbers
import operators.Operators


open class Message()

class PrintedMessages : Message(){

    fun printMessage(userMessage: Any) {
        println(userMessage)
    }

}

fun createdMessageUser(message: PrintedMessages) {

    message.printMessage("| Welcome to Math Application |")
}

fun main() = runBlocking {

    val math = Numbers()
    val num1 = math.createNumbers(1, 10)
    val num2 = math.createNumbers(1, 10)

    val op = Operators()

    var i = 0
    while (true) {

        val printMessages = PrintedMessages()
        createdMessageUser(printMessages)

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