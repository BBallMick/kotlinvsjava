package kotlinproject.typecast

import javaproject.boilerplate.Person
import java.time.Instant
import java.util.*

fun main() {

    val list = listOf("hej", Person("John"))
    var name: Any

    list.forEach {
        name = when(it) {
            is String -> it.toUpperCase()
            is Person -> it.name
            else -> {return}
        }
        println(name)
    }

}