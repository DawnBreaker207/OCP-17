package ClassDesign.AbstractClasses;

abstract class Canine {
    public abstract String getSound();

    public void bark() {

	System.out.println(getSound());
    }
}

class Wolf extends Canine {
    public String getSound() {
	return "Wooooooof!";
    }
}

public class Fox extends Canine {
    public String getSound() {
	return "Squeak!";
    }

    public static void main(String[] p) {
	Canine w = new Fox();
	w.bark();
    }
}

class Coyote extends Canine {
    public String getSound() {
	return "Roar!";
    }
}