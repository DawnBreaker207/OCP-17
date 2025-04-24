package CollectionsAndGenerics.Generics;

public interface Shippable<T> {
    void ship(T t);
}

class ShippableRobottCrate implements Shippable<Robot> {
    public void ship(Robot t) {
    }

}

class ShippableAbtractCrate<U> implements Shippable<U> {
    public void ship(U t) {

    }
}

class ShippableCrate implements Shippable {
    public void ship(Object t) {

    }
}