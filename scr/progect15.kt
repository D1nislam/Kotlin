
fun main() {
    // Ввод длины первого массива от пользователя
    println("Введите длину первого массива:")
    val firstArrayLength = readLine()?.toIntOrNull()

    // Ввод длины второго массива от пользователя
    println("Введите длину второго массива:")
    val secondArrayLength = readLine()?.toIntOrNull()

    // Проверка корректности ввода
    if (firstArrayLength != null && firstArrayLength > 0 && secondArrayLength != null && secondArrayLength > 0) {
        // Создание и заполнение первого массива
        val firstArray = IntArray(firstArrayLength)
        for (i in 0 until firstArrayLength) {
            println("Введите элемент для первого массива №${i + 1}:")
            firstArray[i] = readLine()?.toIntOrNull() ?: 0
        }

        // Создание и заполнение второго массива
        val secondArray = IntArray(secondArrayLength)
        for (i in 0 until secondArrayLength) {
            println("Введите элемент для второго массива №${i + 1}:")
            secondArray[i] = readLine()?.toIntOrNull() ?: 0
        }

        // Объединение двух массивов и создание нового массива в обратном порядке
        val combinedArray = (firstArray + secondArray).reversedArray()

        // Вывод нового массива
        println("Новый массив в обратном порядке:")
        println(combinedArray.joinToString(", "))
    } else {
        println("Введите корректные значения длины массивов.")
    }
}