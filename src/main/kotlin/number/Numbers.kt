package number

import kotlin.random.Random

open class Math

class Numbers : Math() {

    fun createNumbers(a: Int, b:Int):Int {

        return Random.nextInt(a, b)

    }

}





