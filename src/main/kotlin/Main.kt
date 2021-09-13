import java.util.*
// Albertus Adrian Susanto
/*
Soal:
Adip adalah seorang pemilik toko yang menyediakan perlengkapan untuk gamer. Anda sebagai teman Adip ingin membantunya dengan membuat sebuah program yang dapat memudahkan user dalam mencari item gaming berdasarkan merk tertentu. Program ini akan meminta user untuk memilih merk yang ingin mereka cari, kemudian menampilkan informasi lengkap terkait produk yang tersedia berdasarkan merk tersebut.

Input:
- User memilih merk berdasarkan nomor

Proses:
- Membuat class Logitech yang menerapkan inner class dan nested class
- Membuat class Rexus yang menerapkan inner class
- Membuat class Steelseries yang menerapkan nested class

Output:
- Program menampilkan seluruh item yang tersedia berdasarkan merk tersebut beserta dengan informasinya lengkap
 */

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    println("=== Selamat Datang di Toko StarGame ===")
    println("1. Logitech")
    println("2. Rexus")
    println("3. Steelseries")
    print("Silakan masukkan merk yang ingin Anda cari berdasarkan nomor di atas [1-3]: ")
    var pilih = reader.nextInt()
    println()
    if (pilih == 1){
        // Membuat object logitech dari class Logitech yang menerapkan nested class dan inner class
        val logitech = Logitech()
        // Membuat object lightSpeed dengan memanfaatkan inner class HeadsetGaming
        val lightSpeed = logitech.HeadsetGaming("PRO X LIGHTSPEED 7.1", "Wireless", 2400000)
        println(lightSpeed.informasi())
        // Membuat object gamepadF310 dengan memanfaatkan nested class HeadsetGaming
        val gamepadF310 = Logitech.Gamepad("F310",285000)
        println("Brand: ${logitech.brand}")
        println(gamepadF310.informasi())
    } else if (pilih == 2){
        // Membuat object rexus dari class Rexus yang menerapkan inner class
        val rexus = Rexus()
        // Membuat object daxa dengan memanfaatkan inner class MouseGaming
        val daxa = rexus.MouseGaming("Daxa Air Pro",400000)
        daxa.informasi()
    } else if (pilih == 3) {
        // Membuat object apex dengan menggunakan nested class KeyboardGaming
        val apex = Steelseries.KeyboardGaming("Apex 5","Mechanical RGB",1695000)
        println("Brand: ${Steelseries().brand}")
        apex.informasi()
    } else {
        println("[PERHATIAN] Mohon maaf, input Anda tidak tersedia!")
    }
}