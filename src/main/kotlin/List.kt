fun main() {
    // list immutable atau tidak bisa diubah
    val listSatu = listOf(1, 'x', false, "Binarian")
    // list mutable atau bisa mengubah data
    val listDua = mutableListOf(1, 2, 3, 4)
    listDua.add(5)
    listDua += 6
    listDua.add(0, 100)

    println("List satu: $listSatu")
    println("List dua: $listDua")
    println("List dua: ${listDua[0]}")

    listDua.remove(1)
    println("List dua: "+listDua)

    listDua.removeAt(5)
    println("List dua: $listDua")

    listDua.removeAll{true}
    println("List dua: "+listDua)

    // mendapatkan jumlah index pada list array
    println("Jumlah index pada list satu: "+listSatu.size)

    // cek data pada list array
    println(listSatu.contains('x'))

    // mencari tau posisi index list array
    println(listSatu.indexOf("Binarian"))

    // mencari tau posisi index terakhir list array
    println(listSatu.lastIndexOf("Binarian"))

    // melihat index pertama dan terakhir list array
    println(listSatu.first())
    println(listSatu.last())

}