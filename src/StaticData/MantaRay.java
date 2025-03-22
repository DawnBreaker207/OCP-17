package StaticData;

public class MantaRay {
    private String name = "Sammy";

    public static void first() {

    }

    public static void second() {

    }

    public void third() {
	System.out.println(name);
    };

    public static void main(String[] args) {
	first();
	second();
//	DOES NOT COMPILE
	third();
    }

}
