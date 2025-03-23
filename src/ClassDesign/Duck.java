package ClassDesign;

public class Duck {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
//	BACKWARD
//	length = this.length;
	this.length = length;
	height = theHeight;
	this.color = "white";
    }

    public static void main(String[] args) {
	Duck b = new Duck();
	b.setData(1, 2);
	System.out.print(b.length + " " + b.height + " " + b.color);
    }

}
