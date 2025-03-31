package BeyondClasses.ImplementingInterfaces;

interface Hop {
    static int getJumpHeight() {
	return 8;
    }

}

public class Skip {
    public int skip() {
	return Hop.getJumpHeight();
    }
}

class Bunny implements Hop {
    public void printDetails() {
	System.out.println(Hop.getJumpHeight());
    }
}