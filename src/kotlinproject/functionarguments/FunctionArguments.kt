package kotlinproject.functionarguments

fun main() {

    //Default argument values
    receiveGreeting("James")
    receiveGreeting("Jones", "Hi")
    receiveGreeting("Jim", "Howdy", "you suck!")

    //Named argument values
    receiveGreeting(
        "Jane",
        greetingPostfix = "you cock!")

    receiveGreeting(
        greetingPrefix = "Mjello",
        name = "Homer",
        greetingPostfix = "you fat bastard!"
    )
}

fun receiveGreeting(name: String, greetingPrefix: String = "Hello", greetingPostfix: String = "you rock!") {
    println("$greetingPrefix $name $greetingPostfix")
}