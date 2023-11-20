package id.infinitelearning.KotlinSubmission.exercise5

fun main() {
    // Create an instance of the Hero class
    val hero = Hero()

    // Set the hero's profile
    hero.setProfile("Procyon", 25, 175.0)

    // Display the initial profile
    println("Initial Profile:")
    hero.profile()

    // Perform activities
    hero.jalan(4)
    hero.lari(2)
    hero.makan(1)
    hero.minum(5)
    hero.lompat(2)
    hero.duduk(3)

    // Display the updated profile after activities
    println("\nUpdated Profile:")
    hero.profile()
}
