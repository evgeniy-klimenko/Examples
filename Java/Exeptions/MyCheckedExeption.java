package ExeptionDZ.ThreeClassesOfExeptions;


public class MyCheckedExeption extends Exception{
    static final String originalExeption = "My own Checked Exeption";


    public MyCheckedExeption() {
        super(originalExeption);
    }

    public String MyCheckedExeption(String s) {
        return s + originalExeption;
    }

    public String getExeption(){
        return MyCheckedExeption(originalExeption);
    }

    public static void main(String[] args) {


        MyCheckedExeption mce = new MyCheckedExeption();
        System.out.println(mce.getExeption());
    }

}
