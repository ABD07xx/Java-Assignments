import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame extends Frame implements ActionListener {
    Label l1;
    Button b1;
    Button b2;
    public frame(){
        super("example");
        l1 =new Label("Java");
        b1 = new Button("Oval Color");
        b2 = new Button("Change Label");
        b1.addActionListener(ButtonListener1);
        b2.addActionListener(ButtonListener2);
        setLayout(new FlowLayout());
        add(b1);
        add(l1);
        add(b2);
    }
    ActionListener ButtonListener1 = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            getGraphics().fillOval(75,75,150,100);
        }
    };
    ActionListener ButtonListener2 = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            if(l1.getText()=="Java"){
                l1.setText("Python");
            }
            else{
                l1.setText("Java");
            }
        }
    };

    @Override
    public void paint(Graphics g) {
        g.drawOval(75,75,150,100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class Example {
    public static void main(String[] args) {
        frame f = new frame();
        f.setVisible(true);
        f.setSize(300,300);
    }
}
