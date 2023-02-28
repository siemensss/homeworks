package second_course.homework2;

public class Main {
    public static void main(String args[]) {
        Gryffindor hp = new Gryffindor("Гарри Поттер", 87, 62, 80, 85, 90);
        Gryffindor rw = new Gryffindor("Рон Уизли", 67, 40, 85, 90, 79);
        Gryffindor gg = new Gryffindor("Гермиона Грейнджер", 88, 95, 69, 70, 60);
        Slytherin dm = new Slytherin("Драко Малфой", 82, 67, 85, 40, 74, 90, 78);
        Slytherin gm = new Slytherin("Грэхэм Монтегю", 55, 74, 70, 61, 51, 67, 83);
        Slytherin grg = new Slytherin("Грегори Гойл", 51, 81, 67, 72, 49, 61, 88);
        Hufflepuff zs = new Hufflepuff("Захария Смит", 65, 78, 65, 76, 88);
        Hufflepuff sd = new Hufflepuff("Седрик Дигори", 85, 90, 88, 91, 97);
        Hufflepuff jff = new Hufflepuff("Джастин Финч-Флетчли", 70, 58, 78, 82, 81);
        Ravenclaw cc = new Ravenclaw("Чжоу Чанг", 84, 60, 90, 82, 81, 90);
        Ravenclaw pp = new Ravenclaw("Падма Патил", 77, 64, 81, 79, 67, 70);
        Ravenclaw mb = new Ravenclaw("Маркус Белби", 65, 70, 71, 84, 65, 72);
        printSeparator();
        compareOfStudents(hp, dm);
        printSeparator();
        hp.printProfile();
        printSeparator();
        sd.printProfile();
        printSeparator();
        compareOfGryffindorStudents(hp, gg);
        printSeparator();
        compareOfHufflepuffStudents(zs, sd);
        printSeparator();
        compareOfRavenclawStudents(cc, mb);
        printSeparator();
        compareOfSlytherinStudents(dm, grg);
    }
    public static void printSeparator(){
        System.out.println("=======================");
    }

    public static void compareOfGryffindorStudents (Gryffindor student1, Gryffindor student2){
        if(student1.sumOfPoints() > student2.sumOfPoints()) {
            System.out.println(student1.getName() + " лучший гриффиндорец чем " + student2.getName());
        } else if (student1.sumOfPoints() < student2.sumOfPoints()) {
            System.out.println(student2.getName() + " лучший гриффиндорец чем " + student1.getName());
        } else{
            System.out.println("Эти гриффиндорцы равны по очкам");
        }
    }
    public static void compareOfSlytherinStudents (Slytherin student1, Slytherin student2){
        if(student1.sumOfPoints() > student2.sumOfPoints()) {
            System.out.println(student1.getName() + " лучший слизеринец чем " + student2.getName());
        } else if (student1.sumOfPoints() < student2.sumOfPoints()) {
            System.out.println(student2.getName() + " лучший слизеринец чем " + student1.getName());
        } else{
            System.out.println("Эти слизеринцы равны по очкам");
        }
    }

    public static void compareOfRavenclawStudents (Ravenclaw student1, Ravenclaw student2){
        if(student1.sumOfPoints() > student2.sumOfPoints()) {
            System.out.println(student1.getName() + " лучший когтевранец чем " + student2.getName());
        } else if (student1.sumOfPoints() < student2.sumOfPoints()) {
            System.out.println(student2.getName() + " лучший когтевранец чем " + student1.getName());
        } else {
            System.out.println("Эти когтевранцы равны по очкам");
        }
    }
    public static void compareOfHufflepuffStudents (Hufflepuff student1, Hufflepuff student2){
        if(student1.sumOfPoints() > student2.sumOfPoints()) {
            System.out.println(student1.getName() + " лучший пуффендуец чем " + student2.getName());
        } else if (student1.sumOfPoints() < student2.sumOfPoints()) {
            System.out.println(student2.getName() + " лучший пуффендуец чем " + student1.getName());
        } else{
            System.out.println("Эти пуффендуйцы равны по очкам");
        }
    }

    public static void compareOfStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " более адаптирован к трансгрессированию чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " более адаптирован к трансгрессированию чем " + student1.getName());
        }
        if (student1.getWitchcraftPower() > student2.getWitchcraftPower()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью магии чем " + student1.getName());
        }

    }
}

