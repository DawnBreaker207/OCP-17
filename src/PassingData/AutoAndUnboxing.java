package PassingData;

public class AutoAndUnboxing {
    public static void main(String[] args) {
	int quack = 5;
//	Convert int to Integer
//	Integer quackquack = Integer.valueOf(quack);
	Integer quackquack = quack;
//	Convert Integer to int
//	int quackquackquack = quackquack.intValue();
	int quackquackquack = quackquack;

	// Autoboxing
	Short tail = 8;
	Character p = Character.valueOf('p');
	// Unboxing
	char paw = p;
	// Autoboxing
	Boolean nose = true;
	Integer e = Integer.valueOf(9);
	// Unboxing, then implicit casting
	long ears = e;
    }
}
