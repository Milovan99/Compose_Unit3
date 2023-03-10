package collections

class Arrays {
    val rockPlanet= arrayOf<String>("Mercury","Venus","Earth","Mars")
    val gasPlanet= arrayOf("Jupiter","Saturn","Uranus","Neptune")

    var solarSystem=rockPlanet+gasPlanet


}
fun main(){
    val planets=Arrays()
    planets.solarSystem[3]="Little Earth"
    println(planets.solarSystem[0])
    println(planets.solarSystem[1])
    println(planets.solarSystem[2])
    println(planets.solarSystem[3])
    println(planets.solarSystem[4])
    println(planets.solarSystem[5])
    println(planets.solarSystem[6])
    println(planets.solarSystem[7])
}