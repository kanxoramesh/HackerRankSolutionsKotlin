package hashmap

import java.util.*
import kotlin.collections.HashMap

fun main() {
    var s = "kkkk"
    var ss = sherlockAndAnagrams(s)
    print(ss)

}

fun sherlockAndAnagrams(s: String): Int {

    var anagramDic = HashMap<String, Int>()
    for (i in 0..s.length) {
        for (j in i..s.length-1) {

            var char = s.substring(i, j + 1).toCharArray()

            Arrays.sort(char)
            var s = String(char)
            println(s)

            var count = if (anagramDic.containsKey(s)) anagramDic.get(s) else 0
            anagramDic.put(s, count!! + 1)

        }
    }
    var count = 0;
    for (data in anagramDic.values) {
        count += (data * (data - 1)) / 2

    }
    return count
}
