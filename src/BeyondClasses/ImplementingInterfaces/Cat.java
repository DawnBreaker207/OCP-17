package BeyondClasses.ImplementingInterfaces;

interface Walk {
    public default int getSpeed() {
	return 5;
    }
}

interface Run {
    public default int getSpped() {
	return 10;
    }
}

public class Cat implements Walk, Run { // DOES NOT COMPILE

    public int getSpped() {
	return 1;

    }

    public int getWalkSpeed() {
	return Walk.super.getSpeed();
    }
}
