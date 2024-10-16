fun main() {
        // Чтение трех чисел с плавающей точкой от пользователя
        println("Введите первое число:")
        val number1 = readLine()?.toDoubleOrNull() ?: 0.0

        println("Введите второе число:")
        val number2 = readLine()?.toDoubleOrNull() ?: 0.0

        println("Введите третье число:")
        val number3 = readLine()?.toDoubleOrNull() ?: 0.0

        // Расчет среднего арифметического
        val average = (number1 + number2 + number3) / 3

        // Вывод результата
        println("Среднее арифметическое: $average")
    }