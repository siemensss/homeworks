package second_course.homework2;

public abstract class Hogwarts {
    private String name;
    private int witchcraftPower;
    private int transgressionDistance;

    public Hogwarts(String name, int witchcraftPower, int transgressionDistance) {
        this.name = name;
        this.witchcraftPower = witchcraftPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getName() {
        return name;
    }
    public abstract void printProfile();
    public abstract int sumOfPoints();


}
