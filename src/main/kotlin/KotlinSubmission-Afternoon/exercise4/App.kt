package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Contoh: Menangani pembagian dengan nol
    val numerator = 100
    val denominator = 6

    try {
        val result = numerator / denominator
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi error aritmatika: ${e.message}")
    }
}
