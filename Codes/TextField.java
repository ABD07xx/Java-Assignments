import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class Frame2 extends Frame {
    Label l1;
    Label l2;
    TextField t;
    public Frame2(){
        super("Text Field Demo");
        l1 = new Label("No Text is yet Entered");
        l2=  new Label("Enter Key isn't hit yet");
        t = new TextField(20);
        Handler h = new Handler();
        t.addActionListener(h);
        t.addTextListener(h);
        setLayout(new FlowLayout());
        add(l1);
        add(t);
        add(l2);




    }



    class Handler implements TextListener,ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(t.getText());
        }

        @Override
        public void textValueChanged(TextEvent te) {
            l1.setText((t.getText()));
        }
    }
}
class Textfield{

    public static void main(String[] args) {
        Frame2 f = new Frame2();
        f.setVisible(true);
        f.setSize(300,300);
    }

}
