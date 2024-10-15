
fun main() {
    // Ввод возраста от пользователя
    println("Введите возраст:")
    val age = readLine()?.toIntOrNull()

    // Проверка возраста и вывод сообщения о возрастной категории
    if (age != null) {
        when {
            age in 0..12 -> println("Ребёнок")
            age in 13..17 -> println("Подросток")
            age in 18..64 -> println("Взрослый")
            age >= 65 -> println("Пожилой")
            else -> println("Некорректный возраст")
        }
    } else {
        println("Некорректный возраст")
    }
}