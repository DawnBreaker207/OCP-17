package BeyondClasses.Polymorphism;

class Primate {
    public boolean hasHair() {
	return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
	return false;
    }

    public int age = 10;

    public static void main(String[] args) {
	Lemur lemur = new Lemur();
	System.out.println(lemur.age);

	HasTail hasTail = lemur;
//	System.out.println(hasTail.age); // DOES NOT COMPILE
	System.out.println(hasTail.isTailStriped());

	Primate primate = lemur; // Implicit Cast to supertype
	System.out.println(primate.hasHair());
//	System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

	Lemur lemur2 = (Lemur) primate; // Explicit Cast to subtype
	
//	Lemur lemur3 = primate; // DOES NOT COMPILE (missing cast)
    }

}
