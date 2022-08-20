fun main() {
    var contohSatu = arrayOf(1.9, 2.9, 3.4, 3.5)
    var contohDua = booleanArrayOf(false, false, true, true)
    var contohTiga = charArrayOf('A', 'B', 'C', 'D')
    var contohEmpat = intArrayOf(1, 2, 3, 4)
    var contohLima = doubleArrayOf(2.0, 1.2, 0.5, 9.6)

    println(contohSatu[0])
    println(contohDua[2])
    println(contohTiga[0])
    println(contohEmpat[3])
    println(contohLima[3])

    val vArray = Array(10){1 * (it + 1)}
    for (i in vArray.indices){
        println("Array index ke $i : ${vArray[i]}")
    }

}