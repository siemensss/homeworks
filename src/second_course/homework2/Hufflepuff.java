package second_course.homework2;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int fidelity;
    private int honesty;

    public Hufflepuff(String name, int witchcraftPower, int transgressionDistance, int diligence, int fidelity, int honesty) {
        super(name, witchcraftPower, transgressionDistance);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }



    @Override
    public  void printProfile () {
        System.out.println("Имя: " + getName() +
                "\nмощность магии: " + getWitchcraftPower() + " баллов" +
                "\nдистанция трансгрессирования: " + getTransgressionDistance() + " баллов" +
                "\nтрудолюбие: " + diligence + " баллов" +
                "\nверность: " + fidelity + " баллов" +
                "\nчестность: " + honesty + " баллов");
    }
    @Override
    public int sumOfPoints (){
        return diligence + fidelity + honesty;
    }


}
