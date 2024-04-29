import javax.print.attribute.PrintJobAttributeSet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formmethod2 {
    formmethod2(){
        Frame frame = new Frame("simple form");

        Label email = new Label("Email :");
        email.setBounds(100,100,100,30);
        TextField emailInput = new TextField("Enter the email");
        emailInput.setBounds(200,100,150,30);

        Label password = new Label("Password :");
        password.setBounds(100,150,100,50);
        TextField passwordInput = new TextField("Enter the password");
        passwordInput.setBounds(200,150,150,30);

        Label age = new Label("Age :");
        age.setBounds(100,200,100,50);
        TextField ageInput = new TextField("Enter the age");
        ageInput.setBounds(200,200,150,30);

        Button submit = new Button("Submit");
        submit.setBounds( 150,270,70,30);

        ButtonListener buttonListener = new ButtonListener(emailInput,passwordInput,ageInput);
        submit.addActionListener(buttonListener);

        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(ageInput);
        frame.add(submit);

        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
         new formmethod2();
    }
}

class ButtonListener implements ActionListener {
            TextField emailIuput;
            TextField passwordInput;

            TextField ageInput;
    ButtonListener(TextField emailInput,TextField passwordInput,TextField ageInput){
        this.emailIuput = emailInput;
        this.passwordInput = passwordInput;
        this.ageInput = ageInput;


    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(emailIuput.getText());
        System.out.println(passwordInput.getText());
        System.out.println(ageInput.getText());

    }
}
/*
output:

Enter the email
Enter the password
Enter the age
2k21it47@kiot.ac.in
1234
23

 */