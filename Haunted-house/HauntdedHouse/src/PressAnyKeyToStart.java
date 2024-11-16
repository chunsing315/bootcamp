import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PressAnyKeyToStart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Press Any Key to Start");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Program started!");
                frame.dispose();  // Close the window
                // Your program logic here
            }
        });

        System.out.println("Press any key to start...");
    }
}