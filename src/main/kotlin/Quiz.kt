class Quiz {

    enum class Difficulty{
        EASY,MEDIUM,HARD
    }

    data class Question<T>(
        val questionText:String,
        val answer:T,
        val difficulty:Difficulty
    )

    companion object StudentProgress{
        var total:Int=10
        var answered:Int=3
    }
    val question1=Question<String>("Quoth the raven ___","nevermore", Difficulty.MEDIUM)
    val question2=Question<Boolean>("The sky is green.True or false",false, Difficulty.EASY)
    val question3=Question<Int>("How many days are between full moons?",28, Difficulty.HARD)


}

fun main(){
    println("${Quiz.answered} of ${Quiz.total} answered.")

}