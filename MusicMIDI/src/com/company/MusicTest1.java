package com.company;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            System.out.println("Sequencer hatası oluştu.");
        }

        System.out.println("Bir sıralayıcımız var.");
    } //close play

    public static void main(String[] args) throws MidiUnavailableException {
        MusicTest1 mt = new MusicTest1();
        mt.play();

    } // close main

} //close class
