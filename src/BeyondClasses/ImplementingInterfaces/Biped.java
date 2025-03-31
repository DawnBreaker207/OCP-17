package BeyondClasses.ImplementingInterfaces;

abstract interface WalkOnTwoLegs {

}

public class Biped {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	var e = new WalkOnTwoLegs(); // DOES NOT COMPILE
    }

}

public final interface WalkOnEightLegs { // DOES NOT COMPILE

}