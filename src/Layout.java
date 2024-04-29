import java.awt.*;
public class Layout {
    Layout(){
        Frame frame = new Frame("simple app");
        Button btn = new Button("click me");
        btn.setBounds(50,30,100,30);
        Label label = new Label("This is a label");
        label.setBounds(50,70,100,20);

        frame.add(btn);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }

    public static void main(String[] args) {
         new Layout();
    }
}
