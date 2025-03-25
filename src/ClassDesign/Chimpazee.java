package ClassDesign;

class Primate {
    public Primate() {
	System.out.print("Primate-");
    }
}

class Ape extends Primate {
    public Ape(int fur) {
	System.out.print("Ape1-");
    }

    public Ape() {
	System.out.println("Ape2-");
    }
}

public class Chimpazee extends Ape {

    public Chimpazee() {
	super(2);
	System.out.print("Chimpanzee-");
    }

    public static void main(String[] args) {
	new Chimpazee();
    }

}
