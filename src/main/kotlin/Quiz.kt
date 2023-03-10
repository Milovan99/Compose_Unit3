class Quiz {

    class Question<T>(
        val questionText:String,
        val answer:T,
        val difficulty:String
    )

}

fun main(){
    val question1=Quiz.Question<String>("Quoth the raven ___","nevermore","medium")
    val question2=Quiz.Question<Boolean>("The sky is green.True or false",false,"easy")
    val question3=Quiz.Question<Int>("How many days are between full moons?",28,"hard")
}