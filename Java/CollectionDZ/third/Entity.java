package CollectionsDZ.first.third;


public class Entity {
    int id;
    String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void compare(Entity entity){
        if (id > entity.id){
            System.out.println("First ID is bigger than Second");
        } else if (id == entity.id){
            System.out.println("ID are equal");
        }else if (id < entity.id){
            System.out.println("Second ID is bigger than First");
        }
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        return name.equals(entity.name);

    }


    public static void main(String[] args) {

        Entity entity = new Entity(25, "Jason");
        Entity entity1 = new Entity(2, "Idaho");

        System.out.println(entity.toString());
        System.out.println(entity1.toString());

        entity.compare(entity1);
        System.out.println(entity.equals(entity1));



    }
}
