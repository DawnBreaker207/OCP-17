package BeyondClasses.NestedClasses;

public class ZooGiftShop {
//    abstract class SaleTodayOnly {
//	abstract int dollarsOff();
//    }
    interface SaleTodayOnly {
	int dollarsOff();
    }

    public int admission(int basePrice) {
	SaleTodayOnly sale = new SaleTodayOnly() {

	    public int dollarsOff() {

		return 3;
	    }
	}; // Don't forget the semicolon!
	return basePrice - sale.dollarsOff();
    }
}

class Gorilla {
    interface Climb {
    }

    Climb climbing = new Climb() {
    };
}