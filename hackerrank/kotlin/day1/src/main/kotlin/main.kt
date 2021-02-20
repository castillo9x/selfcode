import java.util.*

fun main(args: Array<String>) {

    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val scan = Scanner(System.`in`)

    val inputInt = scan.nextLine().toInt()
    val inputDouble = scan.nextLine().toDouble()
    val inputString = scan.nextLine()

    println(i + inputInt)
    println(d + inputDouble)
    println("HackerRank $inputString")

    scan.close()



}