package MyPackage;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseAdapterDemo extends MouseAdapter {
    JFrame frame;
    JPanel panel;
    JButton button;
    public MouseAdapterDemo(){
        frame = new JFrame("trick~~");
        button = new JButton("try to click me~~~");
        panel = new JPanel();
        button.addMouseListener(this);
        panel.add(button);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e){
        int x = (int)(Math.random() * 1000);
        int y = (int)(Math.random() * 800);
        button.setLocation(x,y);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
