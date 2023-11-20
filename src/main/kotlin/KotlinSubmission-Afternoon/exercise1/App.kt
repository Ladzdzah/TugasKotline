package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Variabel dengan ketentuan yang diberikan
    val firstName: String = "Ladzdzah"
    val lastName: String = "Hanan"
    val age: Int = 21
    val isSingle: Boolean = true

    // Menampilkan nilai variabel ke layar
    println("Nama Depan : $firstName")
    println("Nama Belakang : $lastName")
    println("Umur : $age tahun")
    println("Status : ${if (isSingle) "Single" else "Tidak Single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Map<String, Any> {
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }

    println("Session: $session")

    return mapOf(
        "GroupID" to groupId,
        "GroupMembers" to groupMember,
        "Session" to session
    )
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    // Buat variable yang berisi daftar anggota grup
    val groupMembers = listOf("Nurafia", "Ladzdzah", "Ervina", "Jody", "Bima")

    // Akses item yang berisi nama Anda dari variable tersebut
    val myName = groupMembers[1] // Indeks 1 karena indeks dimulai dari 0

    // Jadikan nilai kembalian untuk fungsi myTeam
    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    // Mengganti array dengan List
    val mentor = listOf("Kak Pupu", "Kak Jessica", "Kak Rey")
    val countOfGroup = listOf("Nurafia", "Ladzdzah", "Ervina", "Jody", "Bima")

    // Menghitung total mentor + jumlah anggota grup
    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("Anggota Grup: $myTeam")

    val totalMember = totalMember()
    println("Total Member group: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     */
    val groupId = "G001"
    val groupMembers = listOf("Nurafia", "Ladzdzah", "Evina")
    val session = "Morning Session"

    // Memanggil fungsi groupDetail dengan nilai argumen yang baru
    val groupInfo = groupDetail(groupId, groupMembers, session)

    // Menampilkan hasil dari fungsi groupDetail
    println("\nGroup Information:")
    println(groupInfo)
}
