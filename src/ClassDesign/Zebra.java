package ClassDesign;

class Animal {
    private int age;

    public Animal(int age) {
	super();
	this.age = age;
    }
}

public class Zebra extends Animal {
    public Zebra(int age) {
	super(age);
    }

    public Zebra() {
	this(4);
    }
}
