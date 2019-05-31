import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private static final int WIN_HEIGHT = 555;
    private static final int WIN_WIDTH = 505;
    private static final int WIN_POS_X = 500;
    private static final int WIN_POS_Y = 300;

    private static StartNewGameWindow startNewGameWindow;
    private static Map field;

    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WIN_POS_X, WIN_POS_Y, WIN_WIDTH, WIN_HEIGHT);
        setTitle("TicTacToe");

        JPanel jPanel = new JPanel(new GridLayout(1, 2));

        JButton btnNewGame = new JButton("Start New Game");
        JButton btnExit = new JButton("Exit Game");
        jPanel.add(btnNewGame);
        jPanel.add(btnExit);

        startNewGameWindow = new StartNewGameWindow(this);


        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);

            }
        });

        add(jPanel, BorderLayout.SOUTH);
        field = new Map();
        add(field, BorderLayout.CENTER);


        setVisible(true);


    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLine) {

        field.startNewGame(mode, fieldSizeX, fieldSizeY, winLine);


    }


}
