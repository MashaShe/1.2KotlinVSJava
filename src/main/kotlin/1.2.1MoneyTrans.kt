fun monetTrans() {
    val amount = 1000000
    val comission: Double = if (0.0075 * amount < 3500.0) 3500.0 else 0.0075 * amount
    println("Домашнее задание 1.2.1 - Денежные переводы")
    println("Сумма перевода: ${amount/100} руб.")
    println("Комиссия: ${comission / 100} руб.\n")

}

