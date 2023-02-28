package second_course.homework1;

public class Main {
    public static void main(String args[]){
        Integer[] value = {3,4};
        changeValue(value);
       // System.out.println(Arrays.toString(value));
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person.toString());
    }
    public static void changeValue (Integer[] value){
        value[0] = 99;
    }
    public static void  changePerson (Person person){
        person.setName("Ilya");
        person.setSurname("Lagutenko");

    }
}
