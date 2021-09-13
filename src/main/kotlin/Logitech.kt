// Membuat class Logitech yang menerapkan nested class dan inner class
class Logitech() {
    // Membuat atribut brand
    val brand = "Logitech"
    // Membuat nested class Gamepad
    class Gamepad(val modelParam: String, val hargaParam:Int){
        val kategori = "Gamepad"
        val model = modelParam
        val harga = hargaParam
        // Membuat method informasi() yang return sebuah string berisi informasi lengkap terkait produk
        // Pada method ini, atribut brand dalam class Logitech tidak dapat dipanggil karena class Gamepad hanya menerapkan konsep nested class
        fun informasi() = "Model: $model\nKategori: $kategori\nHarga: $harga\n"
    }
    // Membuat inner class HeadsetGaming
    inner class HeadsetGaming(val modelParam: String, val tipeParam: String = "", val hargaParam:Int){
        val model = modelParam
        val kategori = "Headset Gaming"
        val tipe = tipeParam
        val harga = hargaParam
        // Membuat method informasi() yang return sebuah string berisi informasi lengkap terkait produk
        // Pada method ini, atribut brand dalam class Logitech dapat dipanggil karena class HeadsetGaming menerapkan inner class
        fun informasi() = "Brand: $brand\n" +
                "Model: $model\n" +
                "Kategori: $kategori\n" +
                "Tipe: $tipe\n" +
                "Harga: $harga\n"
    }
}