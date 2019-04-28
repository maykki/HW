public class Main {

    public static void main(String[] args) {
//        Создать переменные всех пройденных типов данных, и инициализировать их значения;
//       8-битное знаковое целое число (от -128 до 127)
        byte b = 1;
        System.out.println(b);
//        16-битное знаковое целое числo (от -32768 до 32767)
        short s = 32765;
        System.out.println(s);

//        32-битное знаковое целое число
        int i = 5;
        System.out.println(i);
//        64-битное знаковое целое число   (от -9223372036854775808 до 9223372036854775807)
        long l = 523231231232342342l;
        System.out.println(l);

//        32-битное знаковое число с плавающей запятой одинарной точности

        final float f = 1.34324234234233f;
        System.out.println(f);

//         64-битное знаковое число с плавающей запятой двойной точности
        final double d = 32.1232412412342234234;
        System.out.println(d);

//         логический тип данных
        final boolean B = (1 < 2);
        System.out.println(B);
//        16-битный тип данных, предназначенный для хранения символов в кодировке Unicode

        final char c = '\u2242';

        System.out.println(c);

        printName(" Вася");
        printResult(2, 3, 4, 5);
        printTruth(4, 5);
        printLogic(0);
        printLogic2(-2);


    }

//    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    public static void printResult(double a, double b, double c, double d) {
        System.out.println(a * (b + (c / d)));
    }

    //    Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static void printTruth(int a, int b) {
        int sum = (a + b);

        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }


//    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void printLogic (int a){

        if (a < 0 ){
            System.out.println("Отрицаиельное");
        } else {
            System.out.println("Положительное");
        }


    }

//    Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    public static void printLogic2 (int a){

        if (a < 0 ){
            System.out.println("true");
        }

    }






//   Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»


    public static void printName(String name) {
        System.out.println("Привет" +  name + "!");

    }



//    * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void printYear (int a){


       if(){



       }

    }

}



