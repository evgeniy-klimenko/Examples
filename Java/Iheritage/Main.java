package Iheritage;

public class Main {
    public static void main(String[] args) {
   Man man = new Man();
   Student student = new Student();

        System.out.println(man.getAge(27));
        System.out.println(man.getGender("Male"));
        System.out.println(man.getName("Malek"));
        System.out.println(man.getWeight(89));
        System.out.println(student.getName("Jason"));
        System.out.println(student.increaseYearOfLearning(3));
        System.out.println(student.getGender("Female"));
    }
}
