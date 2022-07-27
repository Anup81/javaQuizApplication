package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Score extends JFrame implements ActionListener {

    Score(String name, int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        setVisible(true);
    }

    public static void main(String[] args){
        new Score("User", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
