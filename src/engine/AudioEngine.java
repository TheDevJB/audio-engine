package engine;

public class AudioEngine {

    private String name;

    public AudioEngine(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("AudEngine'" + name + "' started");
    }

    public void stop() {
        System.out.println("AudEngine'" + name + "' stopped");
    }

}
