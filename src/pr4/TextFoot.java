package pr4;
import java.awt.*;
import javax.swing.*;

class Football extends JFrame
{
    int Madrid  = 0;
    int Milan = 0;
    JButton button2 = new JButton("AC Milan");
    JButton button3 = new JButton("Real Madrid");

    JLabel text1 = new JLabel("Result: 0 X 0");
    JLabel text2 = new JLabel("Last Scorer: N/A");
    Label  text3 = new Label("Winner: N/A");

    void results(){
        text1.setText(String.format("Result: %d X %d",Milan,Madrid));

        if(Madrid<Milan) {text3.setText("Winner: AC Milan!");}
        else if (Madrid>Milan){text3.setText("Winner: Real Madrid!");}
        else { text3.setText("Draw!");}
    }

    Font fnt = new Font("Times new roman",Font.BOLD,20);

    public Football()
    {

        super("Football");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,150);

        add(button2);
        add(button3);
        add(text1);
        add(text2);
        add(text3);
        button3.setBounds(new Rectangle(100,130,150,50));
        button2.setBounds(new Rectangle(250,130,100,50));

        button2.addActionListener(actionEvent->{
            Milan++;
            text2.setText("Last Scorer: AC Milan");
            results();
        });
        button3.addActionListener(actionEvent->{
            Madrid++;
            text2.setText("Last Scorer: Real Madrid");
            results();
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Football();
    }
}