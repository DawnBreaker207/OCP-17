package Varargs;

public class VisitAttractions {
    public void walk1(int... steps) {
	int[] step2 = steps;
	System.out.println(step2.length);
    }

    public void walk2(int start, int... steps) {
    }

//    DOES NOT COMPILE
    public void walk3(int... steps, int start) {
    }

//    DOES NOT COMPILE
    public void walk4(int... starts, int... steps) {
    }

    public static void main(String[] args) {
	VisitAttractions demo = new VisitAttractions();
	int[] data = new int[] { 1, 2, 3 };
	demo.walk1(data);
	demo.walk1(1, 2, 3);
    }

}
