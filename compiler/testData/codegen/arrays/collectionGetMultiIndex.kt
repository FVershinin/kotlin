import java.util.ArrayList

fun ArrayList<String>.get(index1: Int, index2: Int) = this[index1 + index2]
fun ArrayList<String>.set(index1: Int, index2: Int, elem: String) {
    this[index1 + index2] = elem
}

fun box(): String {
    val s = ArrayList<String>(1)
    s.add("")
    s[1, -1] = "OK"
    return s[2, -2]
}
