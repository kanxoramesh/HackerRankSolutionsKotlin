package kotlintest

class Check {
}




val aa by lazy {
    2
}
val aVar by lazy {
    println("I am computing this value")
    "Hola"
    ""
}

fun main(args: Array<String>) {
    var a = Hello("ramesh")
    a updateName "Pokhrel"
    println(a.updatedName)

}
class Hello(val fname: String) {


    var updatedName: String? = null
    infix fun updateName(lastName: String) {
        updatedName = fname + " " + lastName
    }


}