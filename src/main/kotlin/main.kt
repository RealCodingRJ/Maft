import number.Numbers
import operators.Operators

fun main() {

    val math = Numbers()
    val num1 = math.createNumbers(1, 10)
    val num2 = math.createNumbers(1, 10)

    val op = Operators()

    var i = 0
    while (true) {

        i += 1;
        if (op.createOperators() == "+") {

            println("What is: $num1 + $num2")
            println("Enter Answer: ")
            val result = readln().toInt()

            if (result == num1 + num2) {

                println("Correct: $num1 + $num2 = ${num1 + num2}")

                break;
            }

        }

        if (op.createOperators() == "-") {

            println("What is: $num1 - $num2")
            println("Enter Answer: ")

            val result = readln().toInt()

            if (result == num1 - num2) {

                println("Correct: $num1 - $num2 = ${num1 - num2}")
                break;
            }

        }

        if (op.createOperators().equals("*")) {

            println("What is: $num1 * $num2")
            println("Enter Answer: ")

            val result = readln().toInt()

            if (result == num1 * num2) {

                println("Correct: $num1 * $num2 = ${num1 * num2}")
                break;
            }

        }
    }
}