import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the isValid function below.
fun isValid(s: String): String {

    var hashmap = HashMap<Char, Int>()

    for (item in s.toCharArray()) {
        var count = if (hashmap.containsKey(item)) hashmap.get(item) else 0

        hashmap.put(item, count!! + 1)


    }
    var values = hashmap.values.toHashSet()
    if (values.size == 1)
        return "YES";
    if (values.size > 2)
        return "NO";

    var max = 0
    var min = Int.MAX_VALUE
    var sameAsMin = 0
    var sameAsMax = 0


    max= Collections.max(values)
    min= Collections.min(values)
    /*  for (value in values) {
          if (value > max) max = value
          if (value < min) min = value
      }
  */

    sameAsMax=hashmap.values.filter { it.equals(max) }.count()
    sameAsMin=hashmap.values.filter { it.equals(min) }.count()
    /*for (value in hashmap.values) {
        if (value == min) ++sameAsMin
        if (value == max) ++sameAsMax
    }*/
    if (min == 1 && sameAsMin == 1) return "YES"
    return if (max - min == 1 && sameAsMax == 1) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = isValid(s)

    println(result)
}
