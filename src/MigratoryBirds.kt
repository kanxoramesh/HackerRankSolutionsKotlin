
import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import java.util.HashMap
import java.util.Map


// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val birds: MutableMap<Int, Int> = HashMap()
    var key = 0

    for (i in 0 until arr.size) {
        if (birds.containsKey(arr[i])) {
            birds[arr[i]] = birds[arr[i]]!! + 1
        } else {
            birds[arr[i]] = 1
        }
    }
    key = Collections.max(birds.entries, Map.Entry.comparingByValue()).key
    return key
}

fun main() {

    val result = migratoryBirds(arrayOf<Int>(3,3,4,4))

    println(result)
}
