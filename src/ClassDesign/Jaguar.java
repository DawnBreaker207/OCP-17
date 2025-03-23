package ClassDesign;

class BigCat {
    protected double size;
}

public class Jaguar extends BigCat {
    public Jaguar() {
	size = 10.2;
    }
    public void printDetails() {
	System.out.print(size);
    }
}

class Spider {
    public void printDetails() {
//	DOES NOT COMPILE
	System.out.println(size);
    }
}