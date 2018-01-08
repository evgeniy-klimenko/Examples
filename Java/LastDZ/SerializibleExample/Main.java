package LastDZ.SerializibleExample;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Entity entity = new Entity(1);
        System.out.println(entity.getId());
        System.out.println(entity.getChangesCounter() + "\n");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/entity.txt"));
        out.writeObject(entity);
        out.close();

        Entity changedentity = new Entity(2);
        System.out.println(changedentity.getId());
        System.out.println(changedentity.getChangesCounter() + "\n");

        ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("D:/entity.txt"));
        out1.writeObject(changedentity);
        out1.close();

        Entity changedentity1 = new Entity(3);
        System.out.println(changedentity1.getId());
        System.out.println(changedentity1.getChangesCounter() + "\n");

        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("D:/entity.txt"));
        out2.writeObject(changedentity1);
        out2.close();

        Entity changedentity2 = new Entity(4);
        System.out.println(changedentity2.getId());
        System.out.println(changedentity2.getChangesCounter() + "\n");

        ObjectOutputStream out3 = new ObjectOutputStream(new FileOutputStream("D:/entity.txt"));
        out3.writeObject(changedentity2);
        out3.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/entity.txt"));
        Entity finalentity = (Entity) in.readObject();
        System.out.println(finalentity.id);
        System.out.println(finalentity.getChangesCounter());

    }
}
