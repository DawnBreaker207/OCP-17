package BeyondClasses.NestedClasses;

public class processData {
    final int length = 5;
    int width = 10;
    int height = 2;
    class VolumeCalculator {
	public int multiply() {
	    return length * width * height; // DOES NOT COMPILE
	}
    }
    width = 2;
}
