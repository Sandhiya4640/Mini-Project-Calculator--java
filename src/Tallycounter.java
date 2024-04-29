import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tallycounter extends Frame{
    TextField display;
    Button incremeant;
    Button reset;
    Tallycounter(){
        display = new TextField("0");
        display.setBounds(250,100,350,50);

        incremeant = new Button("Increment");
        incremeant.setBounds(250,200,150,30);

       incremeant.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int num = Integer.parseInt(display.getText());
               display.setText(String.valueOf(++num));
           }
       });

        reset = new Button("Reset");
        reset.setBounds(450,200,150,30);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });


        add(display);
        add(incremeant);
        add(reset);

        setTitle("Tally Counter");
        setSize(500,500);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Tallycounter();
    }
}
