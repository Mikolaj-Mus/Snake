import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        this.add(new GamePanel()); // dodanie do ramki gry panelu sterowania
        this.setTitle("Snake"); // ustawianie tytulu
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ustawienie x na wyjscie z gry
        this.setResizable(false);
        this.pack(); // funkcja ktora dopasuje ramke do wszystkich komponentow ktore do niej dodamy
        this.setVisible(true); // wyswietlanie ramki
        this.setLocationRelativeTo(null); // wyswietlanie na srodku monitora

    }
}
