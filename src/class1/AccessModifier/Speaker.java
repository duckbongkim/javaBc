package class1.AccessModifier;

public class Speaker {
    public static void main(String[] args) {
        AccessModifier speaker = new AccessModifier(80);
        speaker.showVolume();

        speaker.setVolume();
        speaker.showVolume();

        speaker.setVolume();
        speaker.showVolume();

        speaker.setVolume();
        speaker.showVolume();

        // volum을 100이 넘도록 만들기
        //speaker.volume = 20000;
        speaker.showVolume();
    }
}
