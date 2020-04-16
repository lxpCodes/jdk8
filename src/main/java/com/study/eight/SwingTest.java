package com.study.eight;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @ClassName SwingTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/13 10:34
 **/
public class SwingTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame");
        JButton button = new JButton("My JButton");

       /* button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Processed");
            }
        });*/
       button.addActionListener(event -> {
           System.out.println("Button Processed");
           System.out.println("hello world");
           System.out.println("button Processed");
       });

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
