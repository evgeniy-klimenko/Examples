package Collections.enumer.DZCollection.Anagrams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Words {


    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Type words:");
        String word = n.nextLine();
        String word1 = n.nextLine();

// LIST SORT
        List<String> wordlist = Arrays.asList(word.split(","));
        List<String> wwordlist1 = Arrays.asList(word1.split(","));
        System.out.println(wordlist);
        System.out.println(wwordlist1);

        for (int i = 0; i < wordlist.size(); i++){
            for (int j = 0; j < wwordlist1.size(); j++){
                char [] onee = wordlist.get(i).toUpperCase().toCharArray();
                char [] twoo = wwordlist1.get(j).toUpperCase().toCharArray();
                Arrays.sort(onee);
                Arrays.sort(twoo);
                if (Arrays.equals(onee,twoo) == true){
                    System.out.println(wordlist.get(i).toUpperCase() + "-" + wwordlist1.get(j).toUpperCase());
                }
            }
        }
        //END OF LIST SORT

        //************************************************
//        // usual array sort
        //USE ONLY TO COMPARE TWO WORDS

//        char [] first = word.toUpperCase().toCharArray();
//            char [] second = word1.toUpperCase().toCharArray();
//            Arrays.sort(first);
//            Arrays.sort(second);
//
//        System.out.println(first);
//        System.out.println(second);
//
//        if (Arrays.equals(first,second) == true){
//            System.out.println("Entered  words are anagrams");
//        }
//        else{
//            System.out.println("Entered  words aren't anagrams");
//        }//end of usual array sort
    }


}
