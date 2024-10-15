
fun main() {
    // Ввод числа от пользователя
    println("Введите число n:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 1) {
        // Вывод удвоенных чисел от 1 до n (исключая границы)
        for (i in 2 until n) {
            println(i * 2)
        }
    } else {
        println("Введите число больше 1.")
    }
}