
fun main() {
    // Ввод числа от пользователя
    println("Введите число для обратного отсчета:")
    val input = readLine()?.toIntOrNull()

    // Проверка, что число корректное
    if (input != null && input > 0) {
        // Обратный отсчет
        for (i in input downTo 1) {
            println(i)
            Thread.sleep(1000) // Задержка 1 секунда между числами
        }
        println("Старт!")
    } else {
        println("Введите корректное положительное число.")
    }
}