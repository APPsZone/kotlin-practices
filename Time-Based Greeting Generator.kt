fun main() {
	// Chunk 1: Define input variables
    val userName = "Eliza"
    val hourOfDay = 10

    // CHUNK 2: Determine the greeting
    val greeting = if (hourOfDay < 12) {
        "Good morning"
    } else if (hourOfDay < 18) {
        "Good afternoon"
    } else {
        "Good evening"
    }
    
    // Chunk 3: Print the final message
    println("$greeting, $userName!")
}