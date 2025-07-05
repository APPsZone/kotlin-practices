// CHUNK 1: Create a calculation function
fun calculate(num1: Double, num2: Double, operator: Char): String {
    // The 'when' expression returns the result of its executed block
    return when (operator) {
        '+' -> "Result: ${num1 + num2}"
        '-' -> "Result: ${num1 - num2}"
        '*' -> "Result: ${num1 * num2}"
        
        // CHUNK 2: Handle the division by zero. This is the critical block for handling division
        '/' -> {
            // First, check if the divisor is zero
            if (num2 == 0.0) {
                // If it is, return the error string immediately
                "Error: Cannot divide by zero."
            } else {
                // If not, perform the calculation
                "Result: ${num1 / num2}"
            }
        }
        
        // This 'else' handles any operator that is not +, -, *, or /
        else -> "Error: Invalid operator."
    }
}

fun main() {
    // CHUNK 3: Call the function and print the result
    // --- Test Case 1: Division by Zero ---
    val num1_test1 = 1000.0
    val num2_test1 = 0.0 // The divisor is zero
    val op_test1 = '/'

    val resultMessage1 = calculate(num1_test1, num2_test1, op_test1)
    println("Test 1: $resultMessage1") // Expected output is the error message

    // --- Test Case 2: Valid Division ---
    val num1_test2 = 20.5
    val num2_test2 = 5.55
    val op_test2 = '/'

    val resultMessage2 = calculate(num1_test2, num2_test2, op_test2)
    println("Test 2: $resultMessage2") // Expected output is the calculated result
}