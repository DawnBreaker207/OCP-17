package BeyondClasses.SealingClasses;

sealed class Mammal permits Equine {

}

public sealed class Equine extends Mammal permits Zebra {

}

final class Zebra extends Equine {

}