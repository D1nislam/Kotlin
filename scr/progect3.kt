
fun main() {
    // Чтение первого символа от пользователя
    println("Введите первый символ:")
    val char1 = readLine()?.firstOrNull()

    // Чтение второго символа от пользователя
    println("Введите второй символ:")
    val char2 = readLine()?.firstOrNull()

    // Проверка, что оба символа введены
    if (char1 != null && char2 != null) {
        // Преобразование символов в Unicode
        val unicode1 = char1.code
        val unicode2 = char2.code

        // Вычисление разницы между Unicode значениями
        val difference = unicode1 - unicode2

        // Вывод результата
        println("Разница между Unicode значениями: $difference")
    }
}