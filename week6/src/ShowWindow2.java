import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {


    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANT

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        // Create a window

        JFrame window = new JFrame();
        // set the title
        // scanner input = new Scanner(System.in);
        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(null);

        JLabel label1 = new JLabel("My First Big Label!!!");
        label1.setBounds(50, 50, 200, 30);
        label1.setFont(new Font("Arial", Font.PLAIN, 18));

        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 85, 300, 40);

        JLabel label2 = new JLabel("My First Big Label!!!");
        label2.setBounds(50, 130, 200, 30);
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        JTextField textField2 = new JTextField();
        textField2.setBounds(50, 165, 300, 40);

        window.add(label1);
        window.add(textField1);
        window.add(label2);
        window.add(textField2);

        window.getContentPane().setBackground(Color.red);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;


        int x = (screenWidth - WINDOW_WIDTH) / 2;
        int y = (screenHeight - WINDOW_HEIGHT) / 2;
        window.setLocation(x, y);

        // display the window - if we do not display the window, it will not display
        // displaying the window is a boolean
        window.setVisible(true);

    }
}

