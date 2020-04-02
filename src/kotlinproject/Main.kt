package kotlinproject

import javaproject.boilerplate.Person
import java.util.List


fun main() {

    val name = "Broelstaerk"

    println("Hello there $name")

    // write your code here
    val integers2 = List.of(1, 2, 3, 4, 5, 6)
    for (i in integers2) {
        var plusOne = i + 1
        plusOne = 7
        println(plusOne)
    }

    var person = Person("John");
    println(person.name)
    person.name = "Louis"
    print(person.name)

}