
fun main() {
    // Ввод возраста от пользователя
    println("Введите возраст:")
    val input = readLine()?.toIntOrNull()

    // Проверка возраста и вывод соответствующего сообщения
    if (input != null) {
        when {
            input < 0 -> println("Введено некорректное значение")
            input >= 18 -> println("Совершеннолетний")
            else -> println("Несовершеннолетний")
        }
    } else {
        println("Введено некорректное значение")
    }
}