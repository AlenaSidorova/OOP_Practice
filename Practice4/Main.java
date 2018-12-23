package Practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MatchScore extends JFrame {

    private int realScore = 0;
    private int milanScore = 0;
    private String lastGoal = "N/A", winner = "DRAW";

    JButton realButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");
    JLabel result = new JLabel("Result: " + realScore + " : " + milanScore);
    JLabel lastScorer = new JLabel("Last Scorer: " + lastGoal);
    Label win = new Label("Winner: " + winner);

    JPanel[] pn1 = new JPanel[9];

    MatchScore()
    {
        super("Practice4");
        setLayout(new GridLayout(3,3));
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for(int i = 0; i < pn1.length; i++) {
            pn1[i] = new JPanel();
            add(pn1[i]);
        }

        pn1[0].setLayout(new FlowLayout());
        pn1[1].setLayout(new FlowLayout());
        pn1[2].setLayout(new FlowLayout());
        pn1[4].setLayout(new FlowLayout());
        pn1[7].setLayout(new FlowLayout());
        pn1[3].add(realButton);
        pn1[5].add(milanButton, BorderLayout.EAST);
        pn1[4].add(result, BorderLayout.CENTER);
        pn1[1].add(lastScorer, BorderLayout.CENTER);
        pn1[7].add(win, BorderLayout.CENTER);

        realButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText("Result: " + ++realScore + " : " + milanScore);
                lastGoal = "Real Madrid";
                if (realScore > milanScore) {
                    winner = "Real Madrid";
                } else if (realScore < milanScore) {
                    winner = "Milan";
                } else if (realScore == milanScore) {
                    winner = "DRAW";
                }
                lastScorer.setText("Last Scorer: " + lastGoal);
                win.setText("Winner: " + winner);
            }
        });

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText("Result: " + realScore + " : " + ++milanScore);
                lastGoal = "AC Milan";
                if (realScore > milanScore) {
                    winner = "Real Madrid";
                } else if (realScore < milanScore) {
                    winner = "Milan";
                } else if (realScore == milanScore) {
                    winner = "DRAW";
                }
                lastScorer.setText("Last Scorer: " + lastGoal);
                win.setText("Winner: " + winner);
            }
        });


        setVisible(true);
    }

    public static void main(String[]args) {
        new MatchScore();
    }
}