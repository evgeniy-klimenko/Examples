package IODZ.Serialization;


public class Holder {
    private String word;

    Holder(String word){
        this.word = word;
    }

    private Holder(){

    }

    private void show(int n){
        for (int i = 0; i < n; i++){
            System.out.println(word);
        }

    }
}
