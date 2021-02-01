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

// Complete the commonChild function below.
fun commonChild(s1: String, s2: String): Int {

    return lcs(s1.toCharArray(), s2.toCharArray(), s1.length, s2.length)


}
/*fun lcs(s1:CharArray,s2:CharArray,m1:Int,m2:Int) :Int{

    if(m1==0 || m2==0)
        return 0
    else if(s1[m1-1]==s2[m2-1])
    {
        return 1+lcs(s1, s2, m1-1, m2-1)
    }else
        return Math.max(lcs(s1,s2,m1,m2-1), lcs(s1,s2,m1-1,m2-1))
}*/

fun lcs(X: CharArray, Y: CharArray, m: Int, n: Int): Int {
    val L = Array(m + 1) { IntArray(n + 1) }

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
           that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */for (i in 0..m) {
        for (j in 0..n) {
            if (i == 0 || j == 0)
                L[i][j] = 0
            else if (X[i - 1] == Y[j - 1])
                L[i][j] = L[i - 1][j - 1] + 1
            else L[i][j] = Math.max(
                L[i - 1][j], L[i][j - 1]
            )
        }
    }
    return L[m][n]
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()

    val s2 = scan.nextLine()

    val result = commonChild(s1, s2)

    println(result)
}
