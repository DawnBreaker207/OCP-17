package CollectionsAndGenerics.Generics;

import java.util.*;

public class Mammal {
    public List<CharSequence> play() {
	return List.of();
    }

    public CharSequence sleep() {
	return "";
    }

}

class Monkey extends Mammal {
    public ArrayList<CharSequence> play() {
	return;
    }
}

class Goat extends Mammal {
    public List<String> play() { // DOES NOT COMPILE
	return List.of();
    }

    public String sleep() {
	return "";
    }
}