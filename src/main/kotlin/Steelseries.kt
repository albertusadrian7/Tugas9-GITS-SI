// Membuat class Steelseries yang mengimplementasikan nested class
class Steelseries() {
    // Membuat atribut brand
    val brand = "Steelseries"
    // Membuat nested class KeyboardGaming
    class KeyboardGaming(val modelParam: String, val tipeParam: String = "", val hargaParam:Int){
        val model = modelParam
        val kategori = "Keyboard Gaming"
        val tipe = tipeParam
        val harga = hargaParam
        // Membuat method informasi() yang dapat menampilkan/mencetak informasi lengkap terkait produk
        // Pada method ini, atribut brand dalam class Steelseries tidak dapat dipanggil karena class KeyboardGaming hanya mengimplementasikan nested class
        fun informasi() {
            println("Model: $model\n" +
                    "Kategori: $kategori\n" +
                    "Tipe: $tipe\n" +
                    "Harga: $harga\n")
        }
    }
}