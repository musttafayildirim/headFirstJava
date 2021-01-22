import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame jFrame;
    JLabel jLabel;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();

    }

    private void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Yazıyı değiştir.");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Dairenin rengini değiştir.");
        colorButton.addActionListener(new ColorListener());

        jLabel = new JLabel("Ben bir yazıyım");
        MyDrawPanel drawPanel = new MyDrawPanel();

        jFrame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        jFrame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        jFrame.getContentPane().add(BorderLayout.EAST, labelButton);
        jFrame.getContentPane().add(BorderLayout.WEST, jLabel);

        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    private class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("Yazı değiştirildi.");
        }
    }//close inner class

    private class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jFrame.repaint();
        }
    }//close inner class

}
