fun main(){
    // Extension Function Demo with when statement
    print("The answer is ${5.Calculator(14, "minus")}")
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


