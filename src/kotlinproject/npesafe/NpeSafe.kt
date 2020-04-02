package kotlinproject.npesafe

import java.lang.NullPointerException

fun main() {
    //Explicit null variable declaration

    var s = "Hej"   //non Nullable type
//    s = null  //compile error

    var s1: String? = "s"   //Nullable type
    s1 = null   //Legal
//    println(s1.length)    //compile error - Since type is nullable the compiler forces us to check for null

    if(s1 != null) {
        println(s1.length)  //No compile error
    }

    //Safe calls
    println(s?.length)  //Safe call not needed because we KNOW the variable cannot be null
    println(s1?.length)     //Returns length of s1 if it's not null otherwise null.

    val nestedProperties = NestedProperties(Parent(Child("Jonas")))

    //Chains
    println(nestedProperties.parent?.child?.name)

    //ignore nulls when iterating using 'let'
    val list = listOf("Hej", null, "dig")
    list.forEach {
        it?.let { println(it) }
    }


    //Only way to encounter an NPE is to either:

    //throw it explicitly
    val nestedPropertiesNullName = NestedProperties(Parent(Child(null)))
    val childNameExplicit = nestedPropertiesNullName.parent?.child?.name?.length ?: throw NullPointerException()    //Explicitly throw the exception

    //or throw it implicitly
    val childNameImplicit = nestedPropertiesNullName.parent!!.child!!.name!!.length

}