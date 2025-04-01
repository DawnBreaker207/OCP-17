package BeyondClasses.Records;

//public final class Crane {

//    private final int numberEggs;
//    private final String name;
//
//    public Crane(int numberEggs, String name) {
//	if (numberEggs >= 0)
//	    this.numberEggs = numberEggs; // guard condition
//	else
//	    throw new IllegalArgumentException();
//	this.name = name;
//    }
//
//    public int getNumberEggs() {
//	return numberEggs;
//    }
//
//    public String getName() {
//	return name;
//    }
//
//}

public record Crane(int numberEggs, String name) {
//    The Long Constructor
//    public Crane(int numberEggs, String name) {
//	if (numberEggs < 0)
//	    throw new IllegalArgumentException();
//	this.numberEggs = numberEggs;
//	this.name = name;
//    }

//    Compact Constructors
//    public Crane {
//	if (numberEggs < 0)
//	    throw new IllegalArgumentException();
//	name = name.toUpperCase();
//    }

//    Transforming Parameters
    public Crane {
	if (name == null || name.length() < 1)
	    throw new IllegalArgumentException();

	name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

// Overloaded Constructors
    public Crane(String firstName, String lastName) {
	this(0, firstName + " " + lastName);

    }

    public Crane(int numberEggs, String firstName, String lastName) {
	this(numberEggs + 1, firstName + " " + lastName);
	numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
//	this.numberEggs = 20; // DOES NOT COMPILE
    }

//    public Crane(String name) {
//	this(1); // DOES NOT COMPILE
//    }
//
//    public Crane(int numberEggs) {
//	this(""); // DOES NOT COMPILE
//    }

    public static void main(String[] args) {
	var mommy = new Crane(4, "Cammy");
	System.out.println(mommy.numberEggs());
	System.out.println(mommy.name());
//	var mommy1 = new Crane("Cammy", 4); // DOES NOT COMPILE
//	var mommy2 = new Crane("Cammy"); // DOES NOT COMPILE

	var father = new Crane(0, "Craig");
	System.out.println(father);

	var copy = new Crane(0, "Craig");
	System.out.println(copy);
	System.out.println(father.equals(copy));
	System.out.println(father.hashCode() + ", " + copy.hashCode());

	var cousin = new Crane(3, "Jenny");
	var friend = new Crane(cousin.numberEggs(), "Janeice");

    }
}

//public final record Crane(int numberEggs, String name) {}

//public record BlueCrane() extends Crane {} // DOES NOT COMPILE

//public interface Bird {}

//public record Crane(int numberEggs, String name) implements Bird {}
