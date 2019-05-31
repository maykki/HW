import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartNewGameWindow extends JFrame {

    private final GameWindow gameWindow;

    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDHT = 350;
    private static final int MIN_WIN_LEN = 3;
    private static final int MAX_WIN_LEN = 10;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_FIELD_SIZE = 3;
    private static final String STR_WIN_LEN = "WINNING LENGHT";
    private static final String STR_FIELD_SIZE = "FIELD SIZE";

    private JRadioButton jrbHumanVSAi = new JRadioButton("AI", true);
    private JRadioButton jrbHumanVSHuman = new JRadioButton("Human");
    private ButtonGroup gameMode = new ButtonGroup();

    private JSlider slFieldSize;
    private JSlider slWinLine;



    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setSize(WIN_WIDHT, WIN_HEIGHT);
        setTitle("New game Parametr");

        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int) (gameWindowBounds.getCenterX() - WIN_WIDHT / 2);
        int posY = (int) (gameWindowBounds.getCenterY() - WIN_HEIGHT / 2);
        setLocation(posX, posY);

        setLayout(new GridLayout(10, 1));

        addGameControlMode();
        addGameControlFieldWinLenght();

        JButton btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGameClick();
            }
        });

        add(btnStartGame);


        setVisible(false);
    }

    private void btnStartGameClick() {

        int gameMode;

        if (jrbHumanVSAi.isSelected()) {
            gameMode = Map.MODE_H_V_A;
        } else {
            gameMode = Map.MODE_H_V_H;
        }

        int fieldSize = slFieldSize.getValue();
        int winLine = slWinLine.getValue();

        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLine);


        setVisible(false);

    }

    private void addGameControlMode() {

        add(new JLabel("Choose your opponent"));
        gameMode.add(jrbHumanVSAi);
        gameMode.add(jrbHumanVSHuman);
        add(jrbHumanVSAi);
        add(jrbHumanVSHuman);


    }

    private void addGameControlFieldWinLenght() {
        add(new JLabel("Choose field size"));
        JLabel lblFieldsSize = new JLabel(STR_FIELD_SIZE + MIN_FIELD_SIZE);
        add(lblFieldsSize);

        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentFieldSize = slFieldSize.getValue();
                lblFieldsSize.setText(STR_FIELD_SIZE + currentFieldSize);
                slWinLine.setMaximum(currentFieldSize);

            }
        });

        add(slFieldSize);


        add(new JLabel("Choose win line"));
        JLabel lblWinLine = new JLabel(STR_WIN_LEN + MIN_WIN_LEN);
        add(lblWinLine);

        slWinLine = new JSlider(MIN_WIN_LEN, MAX_WIN_LEN, MIN_WIN_LEN);
        slWinLine.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblWinLine.setText(STR_WIN_LEN + slWinLine.getValue());
            }
        });

        add(slWinLine);

    }


}
