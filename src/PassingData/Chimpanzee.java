package PassingData;

public class Chimpanzee {
    public void climb(long t) {
    }

    public void swing(Integer u) {
    }

    public void jump(int v) {
    }

    public void rest(Long x) {
	System.out.print("long");
    }

    public static void main(String[] args) {
	var c = new Chimpanzee();
	c.climb(123);
	c.swing(123);
	c.jump(123L); // DOES NOT COMPILE
	c.rest(8); // DOES NOT COMPILE
    }
}
