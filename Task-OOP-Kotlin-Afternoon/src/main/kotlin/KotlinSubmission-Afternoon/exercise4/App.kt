package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    bagi(10, 0)
}

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun bagi(a: Int, b: Int){
    try {
    // Potensial kode yang dapat melempar exception
        val hasil = a / b
        println("Hasil: $hasil")
    } catch (e: ArithmeticException) {
        // Blok yang akan dijalankan jika terjadi ArithmeticException
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } catch (e: Exception) {
        // Blok yang akan dijalankan jika terjadi exception lainnya
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        // Blok yang akan dijalankan setelah try-catch selesai, terlepas dari apakah exception terjadi atau tidak
        println("Finally block dijalankan")
    }
}