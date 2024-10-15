
fun main() {
    // Чтение символа от пользователя
    println("Введите символ:")
    val input = readLine()?.firstOrNull()

    // Проверка, является ли символ буквой
    val isLetter = input?.isLetter() ?: false

    // Вывод результата
    println("$isLetter")
}