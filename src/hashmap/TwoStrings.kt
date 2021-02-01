package hashmap

fun main() {

}

fun twoStrings(s1: String, s2: String): String {
    var hashMap1 = HashSet<Char>()
    var hasValue = "NO"
    for (i in s1.toCharArray()) {
        hashMap1.add(i)

    }
    for (j in s2.toCharArray()) {
        if (hashMap1.contains(j)) {

            hasValue = "YES"
            break
        }
    }
    return hasValue

}