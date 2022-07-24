package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {


    // As soon as class runs, we want to see frame so constructor created here
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setSize(1200, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Login(); //anonymous Object
    }
}
