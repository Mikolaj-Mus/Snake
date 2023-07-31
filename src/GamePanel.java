import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600; // szerokosc ekranu
    static final int SCREEN_HEIGHT = 600; // wysokosc ekranu
    static final int UNIT_SIZE = 25; // wielkosc jednej kratki w siatce jaka bedzie ekran
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE; // liczba kratek jaka posiada ekran
    static final int DELAY = 75; // czas opoznienia
    final int x[] = new int[GAME_UNITS]; // tablica przechowywujaca wartosci x kratek na ktorych jest waz
    final int y[] = new int[GAME_UNITS]; // to samo tylko y
    int bodyParts = 6; // startowa wielkosc weza
    int applesEaten = 0; // startowe zjedzone jablka
    int appleX; // wspolrzedna x na ktorej znajdzie sie jablko
    int appleY; // to samo y
    char direction = 'R'; // poczatkowy kierunek ruchu weza
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)); // ustawienie rozmiaru ekranu
        this.setBackground(Color.BLACK);
        this.setFocusable(true); // game panel bedzie mogl reagowac na klawiature
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
    }

    public void paintComponent(Graphics g){

    }

    public void draw (Graphics g) {

    }
    public void newApple() {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }
    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}
