package ClassDesign;

class Animal {
    static {
	System.out.print("A");
    }
}

public class Hippo extends Animal {
    public static void main (String[] args) {
	System.out.print("C");
	new Hippo();
	new Hippo();
	new Hippo();
    }
    
    static {
   	System.out.print("B");
       }
}
