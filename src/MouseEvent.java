import java.awt.*;
import java.awt.event.MouseListener;

public class MouseEvent  implements MouseListener{
    Label status;
    Frame frame;
    MouseEvent(){
        status = new Label("This  is the label");
        status.setBounds(200,100,300,30);
        Frame frame = new Frame("MouseEvent");

        frame.add(status);
        frame.addMouseListener(this);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new MouseEvent();
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        status.setText("The Mouse  is clicked");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        status.setText("The Mouse  is Entered");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        status.setText("The Mouse  is Exited");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        status.setText("The Mouse  is Pressed");

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        status.setText("The Mouse  is Released");
    }
}
