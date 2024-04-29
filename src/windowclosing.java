import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class windowClosing extends Frame {
    windowClosing(){
        Button sumbit = new Button("Submit");

        add(sumbit);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setTitle("Closewindow");
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
    }


    public static void main(String[] args) {
        new windowClosing();
    }
}
//simple method of closing window.