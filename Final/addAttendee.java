import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addAttendee {



    private JFrame frame;
    private JTextField firstArea;
    private JTextField lastArea;
    private JTextField seatArea;
    private JTextField ageArea;
    private JTextField priceArea;

    public static void addPerson() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    addAttendee window = new addAttendee();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public addAttendee() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame("Add Attendee");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("First Name");
        label.setBounds(10, 19, 70, 14);
        frame.getContentPane().add(label);

        JLabel label_1 = new JLabel("Last Name");
        label_1.setBounds(10, 94, 66, 14);
        frame.getContentPane().add(label_1);

        JLabel label_2 = new JLabel("Age");
        label_2.setBounds(38, 169, 38, 14);
        frame.getContentPane().add(label_2);

        JLabel label_3 = new JLabel("Seat");
        label_3.setBounds(227, 51, 38, 14);
        frame.getContentPane().add(label_3);

        JLabel label_4 = new JLabel("Price");
        label_4.setBounds(227, 118, 39, 14);
        frame.getContentPane().add(label_4);

        firstArea = new JTextField();
        firstArea.setColumns(10);
        firstArea.setBounds(86, 11, 107, 31);
        frame.getContentPane().add(firstArea);

        lastArea = new JTextField();
        lastArea.setColumns(10);
        lastArea.setBounds(86, 86, 107, 31);
        frame.getContentPane().add(lastArea);

        ageArea = new JTextField();
        ageArea.setColumns(10);
        ageArea.setBounds(86, 161, 66, 31);
        frame.getContentPane().add(ageArea);

        seatArea = new JTextField();
        seatArea.setColumns(10);
        seatArea.setBounds(276, 45, 66, 31);
        frame.getContentPane().add(seatArea);

        priceArea = new JTextField();
        priceArea.setColumns(10);
        priceArea.setBounds(276, 112, 66, 31);
        frame.getContentPane().add(priceArea);

        JButton add = new JButton("Add Attendee");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = Global.checkTotal(Global.Atd);
                String first = firstArea.getText();
                String last = lastArea.getText();
                int age = Integer.parseInt(ageArea.getText());
                int seat = Integer.parseInt(seatArea.getText());
                double price = Double.parseDouble(priceArea.getText());

                if (Attendee.Check_Availability(seat,Global.Atd, total))
                    Global.Atd[total] = new Attendee(first, last, age, seat, price);
                else
                    JOptionPane.showMessageDialog(null, "This seat is currently occupied");
            }
        });
        add.setBounds(297, 228, 127, 23);
        frame.getContentPane().add(add);

        JButton clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                firstArea.setText(" ");
                lastArea.setText(" ");
                ageArea.setText(" ");
                seatArea.setText(" ");
                priceArea.setText(" ");
            }
        });
        clear.setBounds(22, 228, 99, 23);
        frame.getContentPane().add(clear);
    }

}
