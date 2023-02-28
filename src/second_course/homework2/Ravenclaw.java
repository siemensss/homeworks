package second_course.homework2;

public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;

    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, int witchcraftPower, int transgressionDistance, int mind, int wisdom, int wittiness, int creativity) {
        super(name, witchcraftPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }


    @Override
    public  void printProfile () {
        System.out.println("Имя: " + getName() +
                "\nмощность магии: " + getWitchcraftPower() + " баллов" +
                "\nдистанция трансгрессирования: " + getTransgressionDistance() + " баллов" +
                "\nум: " + mind + " баллов" +
                "\nмудрость: " + wisdom + " баллов" +
                "\nостроумие: " + wittiness + " баллов" +
                "\nтворчество: " + creativity + " баллов");
    }
    @Override
    public int sumOfPoints (){
        return mind + wisdom + wittiness + creativity;
    }
}
