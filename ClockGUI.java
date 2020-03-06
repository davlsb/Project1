import javax.swing.*;
import java.awt.*;


public class ClockGUI extends JFrame {
    
    private JFrame myGUI;
    //private Clock [] cArr1;
    //private Clock [] cArr2;
    private TextArea text;
    private TextArea textArea2;
    private int size;
    
    public ClockGUI(Clock[] Arr1, Clock[] Arr2,int size) {
        //this.cArr1=Arr1;
        //this.cArr2=Arr2;
        this.size=size;
        this.text = new TextArea();
        this.textArea2 = new TextArea();
        this.myGUI=new JFrame();
        this.createGUI(Arr1,Arr2);
        this.addText(Arr1,Arr2);
        myGUI.setVisible(true);
        }

        public void createGUI (Clock[] Arr1,Clock[] Arr2)
        {        
        myGUI.setTitle("Clocks");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.setSize(400,400);//width, height);
        myGUI.setLocation(100,100);//x, y);
        myGUI.setLayout(new GridLayout(1,2));
        }
        
        public void addText(Clock[] cArr1,Clock[] cArr2) {

        myGUI.getContentPane().add(text);
        text.setEditable(false);
        text.setText("Unsorted: "+"\n");
        for(int i=0; i<size; i++)
            text.append(cArr1[i] + "\n");          


        myGUI.getContentPane().add(textArea2);
        textArea2.setEditable(false);
        
        textArea2.setText("Sorted: "+"\n");
        for(int i=0; i<size; i++)
            textArea2.append(cArr2[i] + "\n");         
        }
        
}