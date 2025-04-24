package ExceptionsAndLocalization.UnderstandExceptions;

class CanNotHopException extends Exception {

}

public class Hopper {
    public void hop() throws CanNotHopException {

    }

}

class Bunny {
    public static void main(String[] args) {
	try {
	    hop();
	} catch (Exception e) {
	    System.out.println(e + "\n");
	    System.out.println(e.getMessage() + "\n");
	    e.printStackTrace();
	}
    }

    private static void hop() { // DOES NOT COMPILE

	throw new RuntimeException("cannot hop");
    }
}