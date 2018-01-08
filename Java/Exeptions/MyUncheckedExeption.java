package ExeptionDZ.ThreeClassesOfExeptions;


public class MyUncheckedExeption extends RuntimeException{
    private static final String unchecked = "My own Unchecked Exeption";

    public MyUncheckedExeption(){
        super(unchecked);
    }
    private String getMyUncheckedExeption() {
        return unchecked;
    }


    public static void main(String[] args) {
       MyUncheckedExeption ue = new MyUncheckedExeption();
        System.out.println(ue.getMyUncheckedExeption());


    }




}
