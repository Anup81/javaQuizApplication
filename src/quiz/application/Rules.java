package quiz.application;


import javax.swing.*;
import java.awt.*;

public class Rules extends JFrame {

    String name;
    Rules(String name){


        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Quiz Game");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. Winner of the Quiz will be awarded Rs. 500" + "<br><br>" +
                        "2. Question pattern are from --- Core Java." + "<br><br>" +
                        "3. You have 15 Sec to complete each question." + "<br><br>" +
                        "4. It is mandatory to submit the answers." + "<br><br>" +
                        "5. No electronic gadgets or equipment is allowed during the quiz." + "<br><br>" +
                        "6. Anyone found using unfair means shall be immediately disqualified." + "<br><br>" +
                        "<html>"
        );
        add(rules);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }


    public static void main(String[] args){
        new Rules("User");
    }
}
