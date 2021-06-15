import java.awt.geom.QuadCurve2D

fun main() {
    println("Денежные переводы ВКонтакте")
    println("Введите сумму перевода")
    val amount = readLine()!!.toInt()
    if(amount<35){
        println("Сумма должна быть больше 35 руб")
    }else{
        val commission = (amount*0.0075*100).toInt()
        println("Комиссия составит $commission коп.")
    }
}