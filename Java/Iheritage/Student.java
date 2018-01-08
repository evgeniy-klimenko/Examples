package Iheritage;

public class Student extends Man {
 static int yearOfLearning;

    public void setYearOfLearning(int yearOfLearning){
        this.yearOfLearning = yearOfLearning;
    }

    public int increaseYearOfLearning( int yearOfLearning){

        return yearOfLearning+1;
    }

    public static void main(String[] args) {

    }
}
