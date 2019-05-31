public class Player {
    private char dot;
    private Logic logic;

    public Player(Logic logic, char dot) {
        this.logic = logic;
        this.dot = dot;
    }

    public Player() {
    }

    public boolean endTurn(){
        if(logic.checkWin(dot)){
            return true;
        }else {
            return false;
        }
    }

}
