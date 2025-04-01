package BeyondClasses.SealingClasses;

public sealed interface Swims permits Duck, Swan, Floats {

}

final class Duck implements Swims {
}

final class Swan implements Swims {
}

non-sealed interface Floats extends Swims {
}