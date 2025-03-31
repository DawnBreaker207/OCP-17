package BeyondClasses.ImplementingInterfaces;

public interface ZooRenovation {
    public String projectName();

    abstract String status();

    default void printStatus() {
	System.out.println("The " + projectName() + " project " + status());
    }
}
