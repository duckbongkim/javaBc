package class1.AccessModifier;

public class AccessModifier {
    private int volume;

    AccessModifier(int volume){
        this.volume = volume;
    }

    void setVolume(){
        if(volume>=100){
            System.out.println("음량을 더 이상 증가할수 없습니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가했습니다.");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: "+volume);
    }
}
