package BeyondClasses.Enums;

interface Weather {
    int getAverageTemperature();
}

enum Season implements Weather {
    WINTER, SPRING, SUMMER, FALL;
//    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

//    private final String expectedVisitor;
//
//    private Season(String expectedVisitors) {
//	this.expectedVisitor = expectedVisitors;
//    }
//
//    public void printExpectedVisitors() {
//	System.out.println(expectedVisitor);
//    }

//    WINTER {
//	public String getHours() {
//	    return "10am-3pm";
//	}
//    },
//    SPRING {
//	public String getHours() {
//	    return "9am-5pm";
//	}
//    },
//    SUMMER {
//	public String getHours() {
//	    return "9am-7pm";
//	}
//    },
//    FALL {
//	public String getHours() {
//	    return "9am-5pm";
//	}
//    };

//    public abstract String getHours();

    public int getAverageTemperature() {
	return 30;
    }

}

//enum ExtendedSeason extends Season {} // DOES NOT COMPILE

public class Seasons {
    void checkSeaon() {
	var s = Season.SUMMER;
	System.out.println(Season.SUMMER);
	System.out.println(s == Season.SUMMER);
    }

    void loopSeaon() {
	for (var season : Season.values()) {
	    System.out.println(season.name() + " " + season.ordinal());
	}
    }

    public static void main(String[] args) {
	var s = new Seasons();
	s.checkSeaon();  
	s.loopSeaon();

	Season s2 = Season.valueOf("SUMMER"); // SUMMER
	System.out.println(s2);
//	Season t = Season.valueOf("summer"); // IllegalArgumentException

	Season summer = Season.SUMMER;
	switch (summer) {
	case WINTER:
	    System.out.println("Get out the sled!");
	    break;
	case SUMMER:
	    System.out.println("Time for the pool!");
	    break;
	default:
	    System.out.println("Is it summer yet?");
	    break;
	}

//	var message = switch(summer) {
//	case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
//	case 0 -> "Time for the pool!"; // DOES NOT COMPILE
//	default -> "Is it summer yet?";
//	}
//	System.out.println(message);

    }
}