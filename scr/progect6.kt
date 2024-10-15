
fun main() {
    // Ввод строки от пользователя
    println("Введите строку:")
    val input = readLine() ?: ""

    // Проверка, что строка содержит хотя бы два символа
    if (input.length >= 2) {
        // Удаление первых двух символов и их перенос в конец
        val modifiedString = input.substring(2) + input.substring(0, 2)

        // Вывод результата
        println("Измененная строка: $modifiedString")
    } else {
        println("Введите строку длиной не менее двух символов.")
    }
}