interface Playable {
    void play();
    void stop();
}

class AudioFile implements Playable {

    public void play() {
        System.out.println("Playing audio file");
    }

    public void stop() {
        System.out.println("Audio stopped");
    }
}

class VideoFile implements Playable {

    public void play() {
        System.out.println("Playing video file");
    }

    public void stop() {
        System.out.println("Video stopped");
    }
}

public class MediaPlayer {
    public static void main(String[] args) {

        Playable[] files = {
                new AudioFile(),
                new VideoFile()
        };

        for (Playable file : files) {
            file.play();
            file.stop();
        }
    }
}