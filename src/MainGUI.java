
import javax.swing.JFrame;


public class MainGUI {
    JFrame frame;
    
    public MainGUI()
    {
        //frame = new JFrame();
        //frame.setSize(800,900);
        //frame.setResizable(false);
        //frame.setLayout(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WriteOffGUI writeOffGui = new WriteOffGUI(new TaxWriteOff());
        frame = writeOffGui;
       // frame.add(writeOffGui);
        
        
        frame.setVisible(true);
    }
    
}
