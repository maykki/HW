import java.util.Random;

public class Ai extends Player {
    private char dot;
    private Logic logic;
    static Random random = new Random();


    public Ai(Logic logic, char dot) {
        this.logic = logic;
        this.dot = dot;
    }

    public boolean endTurn(){
        if(logic.checkWin(dot)){
            return true;
        }else {
            return false;
        }
    }

    public int[] turn(){
        int [] tmp = new int[2];
        int x;
        int y;
        x = random.nextInt(logic.size);
        y = random.nextInt(logic.size);

        tmp[0] = x;
        tmp[1] = y;
        return tmp;
    }




}


