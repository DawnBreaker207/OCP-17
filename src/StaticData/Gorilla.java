package StaticData;

public class Gorilla {
    public static int count;

    public static void addGorilla() {
	count++;
    }

    public void babyGorilla() {
	count++;
    }

    public void announceBabies() {
	addGorilla();
	babyGorilla();
    }

    public static void announceBabiesToEveryone() {
	addGorilla();
//    DOES NOT COMPILE
	babyGorilla();
    }

    public int total;
//  DOES NOT COMPILE
    public static double average = total / count;
}
