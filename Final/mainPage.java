import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mainPage {

    private JFrame frame;

    public static void run() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainPage window = new mainPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public mainPage() {

        initialize();
    }

    private void initialize() {

        frame = new JFrame("Attendee Manager");
        frame.setBounds(100, 100, 340, 297);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Add Attendee");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAttendee nw = new addAttendee();
                nw.addPerson();
            }
        });
        btnNewButton.setBounds(54, 25, 220, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnUpdateManager = new JButton("Update Manager");
        btnUpdateManager.setBounds(54, 80, 220, 23);
        frame.getContentPane().add(btnUpdateManager);

        JButton btnRemoveManager = new JButton("Remove Manager");
        btnRemoveManager.setBounds(54, 142, 220, 23);
        frame.getContentPane().add(btnRemoveManager);

        JButton btnShowList = new JButton("Show List");
        btnShowList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnShowList.setBounds(54, 198, 220, 23);
        frame.getContentPane().add(btnShowList);
    }
}
