package CollectionsDZ.first.second;

public class User {
    int id;
    String name;
    String lastname;

    public User(int id, String name, String lastname) {
        this.id  = id;
        this.name = name;
        this.lastname  = lastname;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void compareTo(User user){
        if (id > user.id){
            System.out.println("First ID is bigger than Second");
        } else if (id == user.id){
            System.out.println("ID are equal");
        }else if (id < user.id){
            System.out.println("Second ID is bigger than First");
        }

    }


    public boolean equalsName(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return name.equals(user.name);

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return lastname.equals(user.lastname);

    }


    public static void main(String[] args) {

        User user = new User(1, " Andrew", "Swift");
        User user1 = new User(2, "Nicolas", "Johnson");

        System.out.println(user.toString());
        System.out.println(user1.toString());

        user.compareTo(user1);
        System.out.println(user.equalsName(user1));
        System.out.println(user.equals(user1));


    }
}
