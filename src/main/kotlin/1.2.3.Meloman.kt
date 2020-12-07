fun musicShop(){
val shoppingSum = 20000
    val  meloman = true
    val discount  = if(shoppingSum<=1000) shoppingSum else if(1001 <=shoppingSum && shoppingSum<10_000) shoppingSum-100 else shoppingSum/100*95
    val totalPrice = if(meloman) discount/100*99 else discount
    println("Домашнее задание 1.2.3 - Меломан")
    println("Сумма покупки: $shoppingSum руб.")
    println("Сумма покупки со всеми скидками: $totalPrice руб.")


}
