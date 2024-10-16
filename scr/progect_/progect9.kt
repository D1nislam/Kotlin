fun main() {
    // Ввод числа от пользователя
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    // Проверка, является ли число четным или нечетным
    if (number != null) {
        if (number % 2 == 0) {
            println("Число $number является четным.")
        } else {
            println("Число $number является нечетным.")
        }
    } else {
        println("Пожалуйста, введите корректное целое число.")
    }
}