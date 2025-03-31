package BeyondClasses.ImplementingInterfaces;

abstract class Husky {
    abstract void play();
}

interface Poodle {
    void play();
}

class Webby extends Husky {
    void play() {

    }
}

public class Georgette implements Poodle {

    void play() { // DOES NOT COMPILE - play() is public in Poodle

    }
}
