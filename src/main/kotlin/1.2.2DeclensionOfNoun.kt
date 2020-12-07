fun numberOfLikes() {
    val likes = 23101;
    val message = if (likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Домашнее задание 1.2.2 - Люди/Человеки")
    println("Понравилось $likes $message \n")
}