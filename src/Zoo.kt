fun main() {
    // Write your code below
    //a list is an array, we can access elements using []
    val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")

    var responsibilitiesComplete = 0
    var timeSpent = 0
    val totalShiftTime = 4

    //maps are key value pares
    //this map will have string keys with any type fir value
    val foxiesHealthCheck = mutableMapOf<String, Any?>()
    val chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First task: ${responsibilities[0]}")
    //not to use a loop
    println("Feeding Bonnie...")
    chimpsHaveEaten["Bonnie"] = true
    println("Feeding Jubilee...")
    chimpsHaveEaten["Jubilee"] = true
    println("Feeding Frodo...")
    chimpsHaveEaten["Frodo"] = true
    println("Feeding Foxie...")
    chimpsHaveEaten["Foxie"] = true

    timeSpent++
    responsibilitiesComplete++
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    println("Next task: ${responsibilities[1]}")

    //sets are like lists but they are unordered and contain unique values only, we cant use [] to get elements but use .elementAt
    val games = setOf("tug-of-war", "catch and throw", "number game")
    val randomGame = games.random()
    println(randomGame)

    timeSpent++
    responsibilitiesComplete++
    println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    println("Next task: ${responsibilities[2]}")
    //we can add to our mutable map in two ways, put or []
    foxiesHealthCheck.put("temperature", 32.7)
    foxiesHealthCheck["mood"] = "happy"
    println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

    timeSpent++
    responsibilitiesComplete++
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size ) {
        println("Well done! Great work")
    } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
        println("Everything completed, but with overtime!")
    } else {
        println("Responsibilities were not complete")
    }
}