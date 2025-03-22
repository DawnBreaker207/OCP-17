package StaticData;

/**
 * 
 */
/**
 * 
 */
public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
	Snake s = new Snake();
	System.out.println(s.hiss);
	s = null;
	System.out.println(s.hiss);
    }
}
