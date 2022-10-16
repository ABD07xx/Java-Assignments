import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener {
    int count = 0;
    Label l;
    Button b;
    Button b2;

    public MyFrame() {
        super("Button Demo");

        l = new Label("  " + count);
        b = new Button("Click");
        b.addActionListener(button1listener);
        b2 = new Button("Reset");
        b2.addActionListener(button1listener2);
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(b2);
    }

    ActionListener button1listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            count++;
            l.setText(" " + count);
        }
    };
    ActionListener button1listener2 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            count = 0;
            l.setText(" " + 0);
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


public class CounterApp {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
        f.setSize(300,300);
    }
}
