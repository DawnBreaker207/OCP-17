package BeyondClasses.NestedClasses;

public class Home {
    private String greeting = "Hi"; // Outer class instance variable

    protected class Room { // Inner class declaration
	public int repeat = 3;

	public void enter() {
	    for (int i = 0; i < repeat; i++)
		greet(greeting);

	}

	private static void greet(String message) {
	    System.out.println(message);
	}
    }

    public void enterRoom() {
	var room = new Room();
	room.enter();
    }

    public static void main(String[] args) {
	var home = new Home(); // Create the outer class instance
	Room room = home.new Room(); // Create the inner class instance
//	var room = new Home().new Room().enter();; // Create the inner class instance
	home.enterRoom();
    }
}
