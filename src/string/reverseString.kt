package string

import javax.xml.stream.events.Characters

fun reverseString(s1: String): String {
    if (s1.length == 1) {
        return s1
    }
    var chars = CharArray(s1.length)
    var pos = 0
    for (i in s1.length - 1 downTo 0) {
        chars[pos] = s1[i]
        pos++
    }

    return String(chars)
}


fun reverseWithoutAffectSpecial(s1: String): String {
    if (s1.length == 1) {
        return s1
    }
    var chararray = s1.toCharArray()

    var l = 0
    var r = s1.length - 1


    while (r > l) {
        if (!Character.isAlphabetic(s1[l].toInt())) {
            l++
        } else if (!Character.isAlphabetic(s1[r].toInt())) {
            r--
        } else {
            var temp = s1[l]
            chararray[l] = chararray[r]
            chararray[r] = temp
            r--
            l++

        }
    }
    return String(chararray)

}

fun main() {

    println(reverseString("Ramesh"))
    println(reverseWithoutAffectSpecial("R'$'am,eshfffff'&'f$$$$$$$$$$$$$$$$$$$$$$$$$$$"))

}