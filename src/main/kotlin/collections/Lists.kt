package collections

class Lists {
    val solarSystem= listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    var mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
}

fun main(){
    println(Lists().solarSystem.size)
    println(Lists().solarSystem[3])
    println(Lists().solarSystem.get(4))
    println(Lists().solarSystem.indexOf("Earth"))
    println()
    for (planet in Lists().solarSystem){
        println(planet)
    }
    var mutableSolarSystem=Lists().mutableSolarSystem
    mutableSolarSystem.add("Pluto")
    mutableSolarSystem.add(3,"Theia")
    mutableSolarSystem[3] = "Future Moon"
    println(mutableSolarSystem[3])
    println(mutableSolarSystem[9])
    mutableSolarSystem.removeAt(9)
    mutableSolarSystem.remove("Future Moon")
    println(mutableSolarSystem.contains("Pluto"))
    println("Future Moon" in mutableSolarSystem)
}