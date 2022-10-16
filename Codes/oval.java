import java.awt.*;
import java.awt.event.*;
class Draw extends Frame implements ActionListener{
    Button b1;
    Button b2;
    Label l;
    public Draw(){
        super("Question 1");
        l = new Label("Java");
        b1 = new Button("Oval Color");
        b1.addActionListener(ButtonListener1);
        b2 = new Button("Change Label");
        b2.addActionListener(ButtonListener2);
        setLayout(new FlowLayout());
        add(l);
        add(b1);
        add(b2);
    }

    ActionListener ButtonListener1 = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            getGraphics().fillOval(75,75,50,100);
        }
    };
    ActionListener ButtonListener2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(l.getText() == "Java"){
            l.setText("Python");    }
            else{
                l.setText("Java");
            }
        }
    };

    public void paint(Graphics g){
        g.drawOval(75,75,50,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class oval {
    public static void main(String[] args) {
        Draw d = new Draw();
        d.setVisible(true);
        d.setSize(300,300);
    }
}
