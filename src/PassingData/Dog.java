package PassingData;

public class Dog {
    public static void main(String[] args) {
//	String name = "Webby";
	var name = new StringBuilder("Webby");
	speak(name);
	System.out.println(name);
    }

    public static void speak(
//	    String name
	    StringBuilder s) {
//	name = "Georgette";
	s.append("Georgette");
    }

}
