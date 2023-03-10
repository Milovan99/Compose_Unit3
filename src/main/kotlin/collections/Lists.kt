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
    var mutablrSolarSystem=Lists().mutableSolarSystem
    mutablrSolarSystem.add("Pluto")
    mutablrSolarSystem.add(3,"Theia")
    mutablrSolarSystem[3] = "Future Moon"
    println(mutablrSolarSystem[3])
    println(mutablrSolarSystem[9])
    mutablrSolarSystem.removeAt(9)
    mutablrSolarSystem.remove("Future Moon")
    println(mutablrSolarSystem.contains("Pluto"))
    println("Future Moon" in mutablrSolarSystem)
}