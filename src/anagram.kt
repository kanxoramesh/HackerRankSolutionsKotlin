import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {

    var hashset = HashMap<Char, Int>()
    for (i in a.toCharArray()) {
        var count = if (hashset.contains(i)) hashset.get(i) else 0

        hashset.put(i, count!!.plus(1))


    }

    for (i in b.toCharArray()) {
        var count = if (hashset.contains(i)) hashset[i] else 0

        hashset.put(i, count!! - 1)

    }

    var total = 0
    for (items in hashset) {
        total += Math.abs(items.value)
    }
    return total

}

fun checkAnagram(s1: String, s2: String): Boolean {

    var count = 0
    if (s1.length != s2.length)
        return false

    for (i in s1) {
        count += i.toInt()
    }
    for (j in s2) {
        count -= j.toInt()
    }

    if (count != 0)
        return false
    else return true

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextLine()

    val b = scan.nextLine()

    val res = makeAnagram(a, b)

    println(res)
    println(checkAnagram(a, b))

}
