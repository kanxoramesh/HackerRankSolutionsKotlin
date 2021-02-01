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

// Complete the arrayManipulation function below.
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {

    var tempArray=LongArray(n+1)

    for(i in 0 until queries.size){
        var a= queries[i][0]
        var b= queries[i][1]
        var k= queries[i][2]

        tempArray[a-1]=tempArray[a-1]+k
        tempArray[b]=tempArray[b]-k

    }
    var max= getMax(tempArray)

    return max


}
fun getMax(array:LongArray):Long{

    var max=Long.MIN_VALUE
    var sum=0L
    for(i in 0 until array.size){

        sum+=array[i];

        max=Math.max(sum,max)


    }
    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
