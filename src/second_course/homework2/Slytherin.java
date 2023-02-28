package second_course.homework2;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;

    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public Slytherin(String name,int witchcraftPower, int transgressionDistance, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, witchcraftPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }



    @Override
    public  void printProfile () {
        System.out.println("Имя: " + getName() +
                "\nмощность магии: " + getWitchcraftPower() + " баллов" +
                "\nдистанция трансгрессирования: " + getTransgressionDistance() + " баллов" +
                "\nхитрость: " + cunning + " баллов" +
                "\nрешительность: " + determination + " баллов" +
                "\nамбициозность: " + ambition + " баллов" +
                "\nнаходчивость: " + ingenuity + " баллов" +
                "\nжажда власти: " + thirstForPower + "баллов");
    }
    @Override
    public int sumOfPoints (){
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }
}
