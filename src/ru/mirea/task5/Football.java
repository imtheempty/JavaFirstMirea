package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {
    public static void main(String[] args) {
        final int[] first = {0};
        final int[] second = {0};

        JFrame frame = new JFrame("Match"); // window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if app close
        frame.setSize(300, 300);

        JButton firstButton = new JButton("AC Milan");
        JButton secondButton = new JButton("Real Madrid");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JLabel result = new JLabel("0 X 0");
        JLabel lastScore = new JLabel("Last score: N/A");
        JLabel winner = new JLabel("Winner: DRAW");

        ActionListener Milan = new ActionListener() { // if AC Milan win
            public void actionPerformed(ActionEvent e) {
                first[0]++;
                result.setText("Result: " + first[0] + " X " + second[0]);
                lastScore.setText("Last score: AC Milan");
                if (first[0] > second[0]) winner.setText("Winner: AC Milan");
                else if (first[0] < second[0]) winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        };
        ActionListener Madrid = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second[0]++;
                result.setText("Result: " + first[0] + " X " + second[0]);
                lastScore.setText("Last score: RealMadrid");
                if (first[0] > second[0]) winner.setText("Winner: AC Milan");
                else if (first[0] < second[0]) winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        };

        firstButton.addActionListener(Milan);
        secondButton.addActionListener(Madrid);

        panel.add(firstButton);
        panel.add(secondButton);
        panel.add(result);
        panel.add(lastScore);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}