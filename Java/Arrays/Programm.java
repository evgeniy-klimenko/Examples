package Arrays;


public class Programm{
    public static void main(String[] args) {
        System.out.println("First meaning of counter: " + Tree.counter);

        Tree[] tree = new Tree[10];

        tree[Tree.counter] = new Tree("Тополь", 55);

        Tree.counter = Tree.counter + 1;

        tree[Tree.counter] = new Tree("Сосна", 153);

        Tree.counter = Tree.counter + 1;

        tree[Tree.counter] = new Tree("Кипарис", 65);

        Tree.counter = Tree.counter + 1;

        tree[Tree.counter] = new Tree("Ольха", 456);

        Tree.counter = Tree.counter + 1;

        tree[Tree.counter] = new Tree("Ясень", 44);

        Tree.counter = Tree.counter + 1;


        for(Tree.counter = 5; Tree.counter < 10; Tree.counter++){
            tree[Tree.counter] = new Tree(Tree.DEFAULTTREE + Tree.DEFAULTHEIGTH);

        }




        System.out.println("Last meaning of counter: " + Tree.counter);

    }
}
