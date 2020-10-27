import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TriangleGUIFrame extends JFrame {
    private JTextField getSideA, getSideB, getSideC;
    private JLabel sideA, sideB, sideC;
    private JButton btn1;

    public TriangleGUIFrame()
    {
        super("Triangle Validator");
        setLayout(new FlowLayout());

        sideA = new JLabel("Enter side A: ");
        sideB = new JLabel("Enter side B: ");
        sideC = new JLabel("Enter side C: ");
        getSideA = new JTextField(10);
        getSideB = new JTextField(10);
        getSideC = new JTextField(10);
        btn1 = new JButton("Enter");

        add(sideA);
        add(getSideA);
        add(sideB);
        add(getSideB);
        add(sideC);
        add(getSideC);
        add(btn1);

        ButtonHandler bh = new ButtonHandler();
        btn1.addActionListener(bh);
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double sideA = Double.parseDouble(getSideA.getText());
            double sideB = Double.parseDouble(getSideB.getText());
            double sideC = Double.parseDouble(getSideC.getText());

            if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){
                JOptionPane.showMessageDialog(null, "Your triangle is possible");
            }
            else{
                JOptionPane.showMessageDialog(null, "Your triangle is impossible!");
            }

        }
    }
}
