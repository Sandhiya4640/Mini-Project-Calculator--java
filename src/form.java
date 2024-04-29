import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form {
    form(){
        Frame frame = new Frame("Form");

       //email
        Label email = new Label("Email :");
        email.setBounds(50,130,100,30);

        TextField emailInput = new TextField("Enter your email");
        emailInput.setBounds(170,130,100,30);


        //password
        Label password = new Label("Password :");
        password.setBounds(50,170,100,30);

        TextField passwordInput = new TextField("Enter your password");
        passwordInput.setBounds(170,170,100,30);


        //age
        Label age = new Label("Age :");
        age.setBounds(50,210,100,30);

        TextField ageInput = new TextField("Enter your age");
        ageInput.setBounds(170,210,100,30);

        // submit button
        Button submit = new Button("Submit");
        submit.setBounds(110,270,50,30);

        //summa
        TextField summa = new TextField("summa");

        //ACTIONlistener

        ActionListener submitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(emailInput.getText());
                System.out.println(passwordInput.getText());
                System.out.println(ageInput.getText());
            }
        };


        submit.addActionListener(submitListener);




        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(ageInput);
        frame.add(submit);
        frame.add(summa);


        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
    }

    public static void main(String[] args) {
        new form();
    }
}

/*
output
Enter your email
Enter your password
Enter your age
2k21it47@kiot.ac.in
1234
20
 */
