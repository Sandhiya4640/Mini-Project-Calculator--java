import java.awt.*;
public class simple1 {
    simple1(){
        Frame frame = new Frame("Simple App");

        Button btn = new Button("click me");
        Button btn2 = new Button("click me");

        frame.add(btn);
        frame.add(btn2);

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(100,100);
        //frame.setTitle("Simple App");
    }

    public static void main(String[] args) {
        new simple1();
    }
}
