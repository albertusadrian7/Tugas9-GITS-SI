// Membuat class Rexus yang memanfaatkan inner class
class Rexus() {
    // Membuat atribut brand
    val brand = "Rexus"
    // Membuat inner class MouseGaming
    inner class MouseGaming(val modelParam: String, val hargaParam:Int){
        // Membuat 3 atribut yaitu kategori, model, dan harga
        val kategori = "Mouse Gaming"
        val model = modelParam
        val harga = hargaParam
        // Membuat function informasi() yang dapat menampilkan/mencetak informasi lengkap terkait produk
        // Pada method ini, atribut brand dalam class Rexus dapat dipanggil karena class MouseGaming menerapkan inner class
        fun informasi() {
            println("Brand: $brand\n" +
                    "Model: $model\n" +
                    "Kategori: $kategori\n" +
                    "Harga: $harga\n")
        }
    }
}