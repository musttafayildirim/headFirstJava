import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {
    static JFrame frame = new JFrame("My First Music Video");
    static MyDrawPanel2 myDrawPanel;

    public static void main(String[] args) {
        MiniMusicPlayer3 miniMusicPlayer3 = new MiniMusicPlayer3();
        miniMusicPlayer3.go();
    }

    private void go() {
        setUpGui();

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(myDrawPanel, new int[] {127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i+=4){
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i+2));
            }//end loop

            sequencer.setSequence(sequence);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        }catch (Exception exception){ exception.printStackTrace();}
    }//close method go

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try{
            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(comd, chan, one, two);
            event = new MidiEvent(shortMessage, tick);
        }catch (Exception exception){ }

        return event;
    }//close method MidiEvent makeEvent

    private void setUpGui() {
        myDrawPanel = new MyDrawPanel2();
        frame.setContentPane(myDrawPanel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }// close method setUpGui


    class MyDrawPanel2 extends JPanel implements ControllerEventListener {

        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g){
            if (msg){

                Graphics g2 = (Graphics2D) g;

                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r,gr,b));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x, y, ht, width);
                msg = false;

            }//close if
        }//close method
    }//close inner class
}
