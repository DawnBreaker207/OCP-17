package ClassDesign;

class Marsupial {
    public double getAverageWeight() {
	return 50;
    }
}

public class Kangaroo extends Marsupial {

    public double getAverageWeight() {
	return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
	System.out.println(new Marsupial().getAverageWeight());
	System.out.println(new Kangaroo().getAverageWeight());

    }

}
