fun main(){
    // Extension Function Demo with when statement
    println("The answer for plus is ${14.Calculator(7, "sum")}")
    println("The answer for minus is ${14.Calculator(7, "minus")}")
    println("The answer for multiplication is ${14.Calculator(7, "multiply")}")
    println("The answer for division is  ${14.Calculator(7, "divide")}")
}


fun Int.Calculator(value2: Int, operation: String): Int{
    var ans = when(operation){
        "sum" -> this + value2
        "minus" -> this - value2
        "multiply" -> this * value2
        "divide" -> this/value2
         else -> 0
    }
    return ans
}


