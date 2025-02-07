package oop;

public class MusicStart {
    public static void main(String[] args){
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.setVolume(+3);
        player.setVolume(-1);
        player.showStatus();
        player.off();
    }
}
