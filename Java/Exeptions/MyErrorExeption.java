package ExeptionDZ.ThreeClassesOfExeptions;


public class MyErrorExeption extends Error{
    static final String wrong = "Error";



    public MyErrorExeption(){
        super(wrong);
    }


}
