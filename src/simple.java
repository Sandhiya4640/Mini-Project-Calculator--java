
import com.sun.jdi.PathSearchingVirtualMachine;

import java.awt.*;
public class simple extends Frame{
    simple(){
        Button btn = new Button("click me");
        Button btn2 = new Button("click me");

        add(btn);
        add(btn2);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(100,100);

    }

    public static void main(String[] args) {
        new simple();
    }
}
