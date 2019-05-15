
    import java.util.Random;
import java.util.Scanner;

public class Maine {

        static final int SIZE = 3;
        static final char DOT_X = 'x';
        static final char DOT_O = 'O';
        static final char DOT_EMPTY = '.';
        static final int DOTS_TO_WIN = 3;
        static char[][] map;
        static Scanner sc = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humansTurn();
                printMap();
                if (checkWin(DOT_X)){
                    System.out.println("ВЫ ВЫЙГРАЛИ");
                    break;

                }
                if (isFull()){
                    System.out.println("НИЧЬЯ");
                    break;

                }

                iiTurn();
                printMap();

                if (checkWin(DOT_O)) {
                    System.out.println("МАШИНА ВЫЙГРАЛА");
                    break;
                }


                if (isFull()){
                    System.out.println("НИЧЬЯ");
                    break;
                }
            }


        }


        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {

                    map[i][j] = DOT_EMPTY;

                }

            }

        }

        public static void humansTurn() {
            int x, y;
            do {
                System.out.println("input koord y x ");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;


            } while (!isCallValid(y, x));
            map[y][x] = DOT_X;

        }
        // *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
// Пока сложно, нет идеи как реализовать
        public static void iiTurn() {
            int x, y;

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);


            } while (!isCallValid(y, x));
            map[y][x] = DOT_O;
        }

        public static void printMap() {
            System.out.print(" ");

            for (int i = 1; i <= SIZE; i++) {
                System.out.print(i + " ");

            }
            System.out.println();


            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");

                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");


                }
                System.out.println();
            }


        }

        public static boolean isCallValid(int y, int x) {
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                return false;
            }
            return map [y][x] == DOT_EMPTY;

        }

        public static boolean isFull() {
            int k = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j]==DOT_EMPTY) {
                        k++;
                    }

                }

            }
            return k == 0;


        }

        // Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов
// * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
        public static boolean checkWin(char symbol){
            int vertical;
            int horizontal;
            int diagonal = 0;
            int diagonalSide = 0;
            for (int i = 0; i <= DOTS_TO_WIN - 1; i++) {
                horizontal = 0;
                vertical = 0;
                for (int j = 0; j <= DOTS_TO_WIN - 1; j++) {

                    if (map[i][j] == symbol) {
                        horizontal++;
                        if (horizontal == DOTS_TO_WIN) return true;
                    }

                    if (map[j][i] == symbol) {
                        vertical++;
                        if (vertical == DOTS_TO_WIN) return true;
                    }
                }

                if (map[i][i] == symbol) {
                    diagonal++;
                    if (diagonal == DOTS_TO_WIN) return true;
                } else diagonal = 0;

                if (map[i][DOTS_TO_WIN - 1 - i] == symbol) {
                    diagonalSide++;
                    if (diagonalSide == DOTS_TO_WIN) return true;
                } else diagonalSide = 0;
            }
            return false;





// if (map [0][0] == symbol && map [0][1] == symbol && map [0][2] == symbol) return true;
// if (map [1][0] == symbol && map [1][1] == symbol && map [1][2] == symbol) return true;
// if (map [2][0] == symbol && map [2][1] == symbol && map [2][2] == symbol) return true;
//
// if (map [0][0] == symbol && map [1][0] == symbol && map [2][0] == symbol) return true;
// if (map [0][1] == symbol && map [1][1] == symbol && map [2][1] == symbol) return true;
// if (map [0][2] == symbol && map [1][2] == symbol && map [2][2] == symbol) return true;
//
// if (map [0][0] == symbol && map [1][1] == symbol && map [2][2] == symbol) return true;
// if (map [0][2] == symbol && map [1][1] == symbol && map [2][0] == symbol) return true;
//
// return false;
        }




}
