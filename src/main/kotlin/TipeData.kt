fun main() {
    var nama: String
    var usia: Int
    var tinggi: Double

    nama = "Faldiansyah"
    usia = 20
    tinggi = 165.0

    println(nama)
    println(usia)
    println(tinggi)

    // -------------------------------------------------------

    val keputusan: Boolean
    val keputusan2: Boolean

    keputusan = false
    keputusan2 = true

    println(keputusan)
    println(keputusan2)

    // ------------------------------------------------------

    val golDar: Char
    golDar = 'A'
    println(golDar)

    // ------------------------------------------------------

    val escapedString: String
    escapedString = "Saya mau\n makan\t nasi\b kuning"
    val rawString = """Saya mau \n istirahat sebentar"""

    println(escapedString)
    println(rawString)

    // -----------------------------------------------------

    val jumlahAnjing = 3
    val jumlahKucing = 2
    println("Saya mempunyai $jumlahAnjing anjing dan $jumlahKucing kucing")
    println("Saya meemiliki ${jumlahAnjing + jumlahKucing} ekor hewan")

}