class Quiz {

    enum class Difficulty{
        EASY,MEDIUM,HARD
    }

    class Question<T>(
        val questionText:String,
        val answer:T,
        val difficulty:Difficulty
    )



}

fun main(){
    val question1=Quiz.Question<String>("Quoth the raven ___","nevermore",Quiz.Difficulty.MEDIUM)
    val question2=Quiz.Question<Boolean>("The sky is green.True or false",false,Quiz.Difficulty.EASY)
    val question3=Quiz.Question<Int>("How many days are between full moons?",28,Quiz.Difficulty.HARD)
}