package BeyondClasses.Polymorphism;

interface Canine {

}

interface Dog {

}

class Wolf implements Canine {

}

public class BadCasts {

    public static void main(String[] args) {
	Wolf wolfy = new Wolf();
	Dog badWolf = (Dog) wolfy;
    }

}
