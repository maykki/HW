public class homeWorkLesson2 {

    public static void main(String[] args) {




        public static void printTask1 () {


            //        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


            int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] == 0) {
                    arr1[i] = 1;

                } else {
                    arr1[i] = 0;

                }

                System.out.println();


            }


        }


        //        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        public static void printTask2 () {

            for (int i = 0; i <= 21; i += 3) {

                System.out.println(i);

            }

        }


        public static void printTask3 () {

//        . Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

            int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr2.length; i++) {

                if (i < 6) {
                    i *= 2;

                }

                System.out.println();
            }


        }


        public static void printTask4 () {

//                4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
            int length = 5;
            int[][] arr4 = new int[length][length];
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0; j < arr4.length; j++) {
                    if ((i == j) || (i == length - 1 - j)) {
                        arr4[i][j] = 1;


                    }

                }



            }


        }





    }
}