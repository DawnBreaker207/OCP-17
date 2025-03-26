package ClassDesign.AbstractClasses;

abstract class Whale {
//    private abstract void sing(); // DOES NOT COMPILE
    protected abstract void sing(); // DOES NOT COMPILE
}

public class HumpbackWhale extends Whale {
    private void sing() {
	System.out.println("Humpback whale is singing");
    }

}
