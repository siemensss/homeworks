package second_course.homework2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name,int witchcraftPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name,witchcraftPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void printProfile () {
        System.out.println("Имя: " + getName() +
                "\nмощность магии: " + getWitchcraftPower() + " баллов" +
                "\nдистанция трансгрессирования: " + getTransgressionDistance() + " баллов" +
                "\nблагородство: " + nobility + " баллов" +
                "\nчесть: " + honor + " баллов" +
                "\nхрабрость: " + bravery + " баллов");

    }
    @Override
    public int sumOfPoints (){
        return nobility + honor + bravery;
    }



}
