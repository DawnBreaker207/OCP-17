package ExceptionsAndLocalization.UnderstandExceptions;

class NoMoreCarrotsException extends Exception {

}

public class Bunny {

//    public static void main(String[] args) throws NoMoreCarrotsException {
//	eatCarrot(); // DOES NOT COMPILE
//    }
    public static void main(String[] args) {
	try {
	    eatCarrot(); // DOES NOT COMPILE
	} catch (NoMoreCarrotsException e) {
	    System.out.println("sad rabbit");
	}
    }

    private static void eatCarrot() throws NoMoreCarrotsException {

    }

}
