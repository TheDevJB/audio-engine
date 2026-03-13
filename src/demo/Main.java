package demo;

import engine.AudioEngine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Audio ENGINE STARTING");

        AudioEngine engine = new AudioEngine("Engine");
        engine.start();
        engine.stop();
    }
}
