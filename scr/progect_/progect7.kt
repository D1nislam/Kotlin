fun main() {
    // Ввод строки от пользователя
    println("Введите строку:")
    val input = readLine()

    // Проверка, что строка не равна null, и вывод длины строки
    if (input != null) {
        println("Длина строки: ${input.length}")
    } else {
        println("Строка равна null.")
    }
}