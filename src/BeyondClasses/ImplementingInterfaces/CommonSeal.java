package BeyondClasses.ImplementingInterfaces;

interface HasTail {
    public int getTailLength();
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers {

}

public class CommonSeal extends HarborSeal { // DOES NOT COMPILE

}
