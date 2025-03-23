package ClassDesign;

public class Hamster {

    private String color;
    private int weight;

    public Hamster(int weight, String color) {
	this.weight = weight;
	this.color = color;
    }

    public Hamster(int weight) {
//	System.out.println("chew");
//	this.weight = weight;
//	color = "brown";
//	new Hamster(weight, "brown");
	this(weight, "brown");
//	this(5); // DOES NOT COMPILE
//	this(); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
