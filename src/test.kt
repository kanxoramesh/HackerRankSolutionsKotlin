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

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    var hashSet = HashSet<Int>()
    var count = 0
    for (i in 0 until n) {
        var curentSuck = ar[i]
        if (hashSet.contains(curentSuck)) {
            count++
            hashSet.remove(curentSuck)


        } else
            hashSet.add(curentSuck)

    }
    return count

}
var a=0
var b=0
fun testNode(c:Int) {

    var d=c

    a=d
    b=d
    d=b+1
    print(a)


}


fun main(args: Array<String>) {

    testNode(5)
}
