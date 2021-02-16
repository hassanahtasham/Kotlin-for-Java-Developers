fun main(){

    val day = enumSample.FRIDAY
    print(day)
}


enum class enumSample(val n: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}
