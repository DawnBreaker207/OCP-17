package ClassDesign;

public class Rhino {
    protected CharSequence getName() {
	return "rhino";
    }

    protected String getColor() {
	return "grey, black , or white";
    }
}

class JavanRhino extends Rhino {
    public String getName() {
	return "javan rhino";
    }

    // DOES NOT COMPILE
    public CharSequence getColor() {
	return "grey";
    }
}