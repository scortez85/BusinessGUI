
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class WriteOffGUI extends JFrame implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel[] labels;
    JButton[] buttons;
    
    
    private TaxWriteOff taxModel;
    
    public WriteOffGUI(TaxWriteOff model)
    {
        frame = new JFrame();
        frame.setSize(800,900);
        frame.setResizable(false);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.taxModel = model;
        panel = new JPanel();
        //panel.setLayout(null);
        panel.setBounds(0,0,800,900);
        buttons = new JButton[4];
        buttons[0] = new JButton();
        buttons[0].setBounds(0,0,128,32);
        frame.add(buttons[0]);
        panel.add(buttons[0]);
        //frame.setVisible(true);
        //this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
