package AccessModifiers.pond.goose;

import AccessModifiers.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
	Goose other = new Goose();
	other.floatInWater();
	System.out.println(other.text);
    }
    
    public void helpOtherGooseSwim() {
	Bird other = new Goose();
//	DOES NOT COMPILE
	other.floatInWater();
	System.out.println(other.text);
    }
}
