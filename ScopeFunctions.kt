import com.sun.source.tree.Scope

fun main(){

    // The Use of apply is to not to write car.capacityPerson and so on, but make an object and write down all properties
    val car = ScopeFunctions("corolla").apply {

        capicityPerson = 5
        modelName = "VX- 155"
        engineCapacity = "1200-CC"
    }

    println(car)

    // Use of let Function, I can changed anyValue, and using lambda it use to print all the elements
    val car2 = ScopeFunctions().let {
        print(it)
        it.modelName = "FX- 567"
        println(it)
    }
}


data class ScopeFunctions(var name: String = "", var capicityPerson: Int = 0,
                          var modelName: String= "", var engineCapacity: String = "") {

}