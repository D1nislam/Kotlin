

fun main() {
    // Ввод числа для проверки
    println("Введите число для проверки:")
    val targetNumber = readLine()?.toIntOrNull()

    // Ввод количества элементов массива
    println("Введите количество элементов массива:")
    val arraySize = readLine()?.toIntOrNull()

    // Проверка корректности ввода
    if (targetNumber != null && arraySize != null && arraySize > 0) {
        val numbersArray = IntArray(arraySize)

        // Ввод элементов массива
        for (i in 0 until arraySize) {
            println("Введите элемент массива №${i + 1}:")
            numbersArray[i] = readLine()?.toIntOrNull() ?: 0
        }

        // Проверка, содержится ли заданное число в массиве
        val containsNumber = targetNumber in numbersArray

        // Вывод результата
        println("Число $targetNumber содержится в массиве: $containsNumber")
    } else {
        println("Пожалуйста, введите корректные значения.")
    }
}