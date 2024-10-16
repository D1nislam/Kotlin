fun main() {
    // Создание списка для хранения строк
    val inputStrings = mutableListOf<String>()

    // Чтение пяти строк от пользователя
    for (i in 1..5) {
        println("Введите строку $i:")
        val input = readLine() ?: ""
        inputStrings.add(input)
    }

    // Объединение всех строк в одну
    val combinedString = inputStrings.joinToString(separator = " ")

    // Вывод результата
    println("Объединённая строка: $combinedString")
}