package LastDZ.SerializibleExample;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Entity implements Serializable{
    int id;
    String name;
    private static Date firstade;
    private static Date seconddate;
    private static String created;  //date of creation
    private static String changed; // last date of changing
    private int changesCounter = 1;

    Entity(int id){
        this.id = id;
        if (id == 1){
            getCreateDateTime();
        }
        else if (id > 1){
            getLastChangesInterval();
        }
    }

    @Override
    public String toString() {
        return "Entity{" +
                "changesCounter=" + changesCounter +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    public int getChangesCounter() {
       if (changesCounter == 1){
           System.out.println(getCreateDateTime());
           return changesCounter;
       }
       else if (changesCounter > 1) {
           System.out.println(getLastChangesInterval());
           return changesCounter;

       }
            return 1;
    }




    public int getId() {
        return id++;
    }

    public String getName() {
        return name;
    }

    public static LocalDateTime getCreateDateTime() { // last data creation
        firstade = new Date();
        created = firstade.toString();
        firstade.getTime();
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.from(ldt1);
        return start;
    }

    public static Date getLastChangesInterval (){
        seconddate = new Date();
        changed = seconddate.toString();
        seconddate.after(firstade);
        long difference = (seconddate.getTime() - firstade.getTime());
        Date diference = new Date(seconddate.getTime() - firstade.getTime());
//        LocalDateTime ldt2 = LocalDateTime.from(getCreateDateTime());
        System.out.println("Difference in time: " + difference);
        return diference;
}

    public static void main(String[] args){
       System.out.println("First date:" + getCreateDateTime());
        System.out.println("\nCreation: " + created + "\n");


        System.out.println("\nSecond date: " + getLastChangesInterval());
        System.out.println("\nChanging: " + changed);


    }


}
