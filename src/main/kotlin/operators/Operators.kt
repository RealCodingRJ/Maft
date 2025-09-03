package operators

import kotlin.random.Random

open class Operator;

class Operators : Operator() {

    fun createOperators(): String {

        val operator = listOf("*", "+", "-");

        val random = Random.nextInt(0, 3)

        return operator[random];


    }

}