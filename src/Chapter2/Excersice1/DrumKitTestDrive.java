package Chapter2.Excersice1;
import java.util.Scanner;
public class DrumKitTestDrive {
    public static void main(String[] args) {
DrumKit d = new DrumKit();
d.playSnare();
d.snare=false;
if (d.snare == true)
{
    d.playTopHat();
}
d.playTopHat();
    }
}
