package ExceptionsAndLocalization.UnderstandExceptions;

class AnimalsOutForAWalk extends RuntimeException {

}

class ExhibitClosed extends RuntimeException {
    public void visitPorcupine() {
	try {

	} catch (AnimalsOutForAWalk e) {
	    System.out.println("try back later");
	} catch (ExhibitClosedForLunch e) {
	    System.out.println("not today");
	}

    }
}

public class ExhibitClosedForLunch extends ExhibitClosed {

}
