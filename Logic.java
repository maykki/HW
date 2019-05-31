public class Logic {
    static final char DOT_X = 'x';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static int dot_to_win;
    static int size;
    static char[][] map;
    int turn = 0;


    public Logic(int size, int dot_to_win) {
        this.size = size;
        this.dot_to_win = dot_to_win;
        initMap();

    }

    public void move(int x, int y) {
        if (turn == 0) {
            map[y][x] = DOT_X;
        } else {
            map[y][x] = DOT_O;
        }

    }

    public void setTurn() {

        if (turn == 0) {
            turn = 1;
        } else {
            turn = 0;
        }

    }

    public int getPlayer() {
        return turn;
    }



    public static boolean isCallValid(int y, int x) {
        if (x < 0 || y < 0 || x >= size || y >= size) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;


    }

    public static boolean isFull() {
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    k++;
                }

            }

        }
        return k == 0;


    }

    public static boolean checkWin(char symbol) {
        int vertical;
        int horizontal;
        int diagonal = 0;
        int diagonalSide = 0;
        for (int i = 0; i <= dot_to_win - 1; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j <= dot_to_win - 1; j++) {

                if (map[i][j] == symbol) {
                    horizontal++;
                    if (horizontal == dot_to_win) return true;
                }

                if (map[j][i] == symbol) {
                    vertical++;
                    if (vertical == dot_to_win) return true;
                }
            }

            if (map[i][i] == symbol) {
                diagonal++;
                if (diagonal == dot_to_win) return true;
            } else diagonal = 0;

            if (map[i][dot_to_win - 1 - i] == symbol) {
                diagonalSide++;
                if (diagonalSide == dot_to_win) return true;
            } else diagonalSide = 0;
        }
        return false;

    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                map[i][j] = DOT_EMPTY;

            }

        }

    }


}
