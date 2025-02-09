import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class test {

    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Hello World Swing Example");
        jFrame.setLayout(null);
        jFrame.setSize(1000, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        //label.setPreferredSize(new Dimension(450, 300));
        label.setBounds(300,15,400,340);

        label.setText("Hello World Swing");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JLabel P1Label = new JLabel("P1");
        P1Label.setText("P1");
        P1Label.setBounds(15,25,100,50);

        String chessPieces [] = {"King", "Queen", "Bishop", "Knight", "Rook", "Pawn"};
        Object pieceMoves [] = {};
        JComboBox P1PieceDropdown = new JComboBox(chessPieces);
        JComboBox P1MoveToDropdown = new JComboBox(pieceMoves);
        P1PieceDropdown.setBounds(75,75,100,30);
        P1MoveToDropdown.setBounds(75,150,100,30);
        jFrame.add(P1PieceDropdown);
        jFrame.add(P1MoveToDropdown);
        
        JLabel P2Label = new JLabel("P2");
        P2Label.setText("P2");
        P2Label.setBounds(875,25,100,50);

        JButton p1Check = new JButton("Check");
        JButton p2Check = new JButton("Check");
        p1Check.setBounds(75,250,100,50);
        p2Check.setBounds(800,250,100,50);

        JButton Edit = new JButton("Edit");
        JButton Start = new JButton("Start");
        Edit.setBounds(395,500, 80, 50);
        Start.setBounds(495,500, 80, 50);
        //x, y, h, w 
        JButton p1CM = new JButton("CM");
        JButton p2CM = new JButton("CM");
        p1CM.setBounds(75, 315, 100, 50);
        p2CM.setBounds(800, 315, 100, 50);

        jFrame.add(P1Label);
        jFrame.add(P2Label);
        jFrame.add(Edit);
        jFrame.add(Start);
        jFrame.add(p1CM);
        jFrame.add(p2CM);
        jFrame.add(p1Check);
        jFrame.add(p2Check);
        jFrame.add(label);

        
        JComboBox P2PeiceDropDown = new JComboBox(chessPieces);
        JComboBox P2MoveToDropDown = new JComboBox(pieceMoves);
        P2PeiceDropDown.setBounds(800, 75, 100, 30);
        P2MoveToDropDown.setBounds(800, 150, 100, 30);
        jFrame.add(P2PeiceDropDown);
        jFrame.add(P2MoveToDropDown);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}