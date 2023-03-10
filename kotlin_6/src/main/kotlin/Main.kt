fun main(args: Array<String>) {
    print("Введите 1-ю цифру: ")
    val num1 = readln().toIntOrNull()
    print("Введите 2-ю цифру: ")
    val num2 = readln().toIntOrNull()

    if (num1 != null && num2 != null
        && num1 < 10 && num1 >= 0 && num2 < 10 && num2 >= 0) {
        if (num1 % 2 != 0) {
            if (num2 == 0) {
                println("Вообще-то можно было бы вывести $num2$num1, но получилась бы чиселка с ведущим нулем..")
            } else {
                println(num2.toString() + num1.toString())
            }
        } else if (num2 % 2 != 0) {
            if (num1 == 0) {
                println("Вообще-то можно было бы вывести $num1$num2, но получилась бы чиселка с ведущим нулем..")
            } else {
                println(num1.toString() + num2.toString())
            }
        } else println("Ой, обе цифры четные..")
    } else {
        println("Ошибочка ввода..")
    }
}