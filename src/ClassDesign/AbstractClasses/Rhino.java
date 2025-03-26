package ClassDesign.AbstractClasses;

public abstract class Mammal {
    abstract void showHorn();

    abstract void eatLeaf();
}

public abstract class Rhino extends Mammal {
    void showHorn() {

    };
}

class BlackRhino extends Rhino {
    void eatLeaf() {

    }
}
