import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Map extends JPanel {

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;
    private Logic logic;
    int[][] field;
    Player player1;
    Player player2;
    Ai player3;

    int fieldSizeX;
    int fieldSizeY;
    int winLine;
    int mode;

    int cellHeight;
    int cellWidth;

    boolean isInit = false;


    public Map() {
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });

    }

    private void update(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        System.out.println(cellX + " " + cellY);
        if(logic.isCallValid(cellY, cellX)){
            draw(cellX, cellY);
        }else{
            //вывести сообщение что клетка занята
        }

    }

    public void draw(int cellX, int cellY) {
        if(mode == 1) {
            if (logic.getPlayer() == 0) {
                drawX(cellX, cellY);
                logic.move(cellX, cellY);
                if (player1.endTurn()) {
                    //вывести сообщение о победе
                } else {
                    if (logic.isFull()) {
                        //вывести сообщение что доска заполнена ничья
                        //выключение
                    }
                    logic.setTurn();
                }

            } else {
                drawO(cellX, cellY);
                logic.move(cellX, cellY);
                if (player2.endTurn()) {
                    //вывести сообщение о победе
                } else {
                    if (logic.isFull()) {
                        //вывести сообщение что доска заполнена ничья
                        //выключение
                    }
                    logic.setTurn();
                }
            }
        }else{
            drawX(cellX, cellY);
            logic.move(cellX, cellY);
            if (player1.endTurn()) {
                //вывести сообщение о победе
            } else {
                if (logic.isFull()) {
                    //вывести сообщение что доска заполнена ничья
                    //выключение
                }
                logic.setTurn();
            }
            int x = 0;
            int y = 0;
            while(!logic.isCallValid(y, x)){
                int[] both = player3.turn();
                x = both[0];
                y = both[1];
            }
            logic.move(x, y);
            drawO(x, y);
            if (player3.endTurn()) {
                //вывести сообщение о победе
            } else {
                if (logic.isFull()) {
                    //вывести сообщение что доска заполнена ничья
                    //выключение
                }
                logic.setTurn();
            }
        }
    }

    private void drawX(int cellX,int cellY){
        getGraphics().drawLine(cellX*cellHeight, cellY*cellWidth,(cellX+1)*cellHeight, (cellY+1)*cellWidth);
        getGraphics().drawLine((cellX)*cellHeight, (cellY+1)*cellWidth,(cellX+1)*cellHeight, (cellY)*cellWidth);
    }

    private void drawO(int cellX, int cellY){
        getGraphics().drawOval(cellX*cellHeight, cellY*cellWidth, cellHeight, cellWidth);

    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLine) {
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winLine);
        logic = new Logic(fieldSizeX, winLine);
        this.mode = mode;
        if (mode==MODE_H_V_A){
             player1 = new Player(logic, 'X');
             player3 = new Ai(logic, 'O');
        }else{
             player1 = new Player(logic, 'X');
            player2 = new Player(logic, 'O');
        }
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLine = winLine;
        field = new int[fieldSizeY][fieldSizeX];

        isInit = true;
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);

    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }
        int panelWight = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWight / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWight, y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

    }
}
