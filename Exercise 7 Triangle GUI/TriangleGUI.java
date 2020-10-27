import javax.swing.*;

public class TriangleGUI {
    public static void main(String[] args)
    {
        TriangleGUIFrame tf = new TriangleGUIFrame();
        tf.setResizable(false);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.setSize(200, 260);
        tf.setVisible(true);
    }
}
