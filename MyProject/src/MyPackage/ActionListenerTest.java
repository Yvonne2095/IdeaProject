package MyPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest extends JFrame {
    JButton button1,button2,button3;
    JPanel panel;

    public ActionListenerTest(){
        super("反复横跳");
        button1 = new JButton("变虾");
        button2 = new JButton("变摩托");
        button3 = new JButton("变小王八");
        panel = new JPanel();
        MouseActionListener mouseActionListener = new MouseActionListener();
        button1.addActionListener(mouseActionListener);
        button2.addActionListener(mouseActionListener);
        button3.addActionListener(mouseActionListener);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        this.add(panel);
        this.setSize(400,300);
        this.setLocation(700,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ActionListenerTest();
    }
    class MouseActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            if (button == button1){
                panel.setBackground(Color.RED);
            }else if (button == button2){
                panel.setBackground(new Color(0,140,0));
            }else if (button == button3){
                panel.setBackground(new Color(255,190,0));
            }
        }
    }
}
