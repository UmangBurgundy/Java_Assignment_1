public class DynamicMethodDispatch {
    static class MediaFile {
        void play() { System.out.println("Playing media..."); }
    }
    static class AudioFile extends MediaFile {
        void play() { System.out.println("Playing audio track..."); }
    }
    static class VideoFile extends MediaFile {
        void play() { System.out.println("Playing video track..."); }
    }

    public static void main(String[] args) {
        MediaFile media;
        media = new AudioFile();
        media.play();
        media = new VideoFile();
        media.play();
    }
}
