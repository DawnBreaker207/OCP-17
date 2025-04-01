package BeyondClasses.Polymorphism;

class Bird {

}

public class Fish {

    public static void main(String[] args) {
	Fish fish = new Fish();
	if (fish instanceof Bird b) { // DOES NOT COMPILE

	}

    }

}
