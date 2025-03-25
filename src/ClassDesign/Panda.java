package ClassDesign;

class Bear {
    public static void eat() {
	System.out.println("Bear is eating");
    }

    public static void sneeze() {
	System.out.println("Bear is sneezing");
    }

    public void hibernate() {
	System.out.println("Bear is hibernating");
    }

    public static void laugh() {
	System.out.println("Bear is laughing");
    }
}

public class Panda extends Bear {
    public static void eat() {
	System.out.println("Panda is chewing");
    }

    public static void main(String[] args) {
	eat();
    }

}

class SunBear extends Bear {
    public void sneeze() { // DOES NOT COMPILE
	System.out.println("Sun Bear sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE
	System.out.println("Sun Bear is going to sleep");
    }

    protected static void laugh() { // DOES NOT COMPILE
	System.out.println("Sun Bear is laughing");
    }
}