package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Procyon", 25, 175.0)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    println("Data Profile:")
    hero.profile()

    /**
     * Procyon -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
     */

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    println("\nProcyon -> ${hero.jalan(4)}x, ${hero.lari(2)}x, ${hero.makan(1)}x, ${hero.minum(5)}x, ${hero.lompat(2)}x, ${hero.duduk(3)}x")


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    println("\nStatus Terkini Setelah Aktivitas:")
    hero.profile()
}

class hero {
    private var name: String = ""
    private var age: Int = 0
    private var height: Double = 0.0

    fun setProfile(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun displayProfile() {
        println("Name: $name")
        println("Age: $age years old")
        println("Height: $height cm")
    }

    fun walk(steps: Int): Int {
        println("$name is walking...")
        return steps
    }

    fun run(steps: Int): Int {
        println("$name is running...")
        return steps
    }

    fun eat(meals: Int): Int {
        println("$name is eating...")
        return meals
    }

    fun drink(cups: Int): Int {
        println("$name is drinking...")
        return cups
    }

    fun jump(times: Int): Int {
        println("$name is jumping...")
        return times
    }

    fun sit(times: Int): Int {
        println("$name is sitting...")
        return times
    }
}
