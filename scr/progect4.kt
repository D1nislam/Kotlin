
fun main() {
    // Чтение символа в нижнем регистре от пользователя
    println("Введите символ в нижнем регистре:")
    val lowerCaseChar = readLine()?.firstOrNull()

    // Проверка, что символ введен
    if (lowerCaseChar != null) {
        // Преобразование символа в верхний регистр
        val upperCaseChar = lowerCaseChar.uppercaseChar()

        // Получение Unicode кода нового символа
        val unicodeCode = upperCaseChar.code

        // Вывод результата
        println("Символ в верхнем регистре: $upperCaseChar")
        println("Unicode код нового символа: $unicodeCode")
    } else {
        println("Пожалуйста, введите символ.")
    }
}