package CollectionsDZ.first.first;

public class Container <C, N, S>{

        C counter;
        N name;
        S surname;

    public void setSurname(S surname) {
        this.surname = surname;
    }

    public void setCounter(C counter) {
        this.counter = counter;
    }

    public void setName(N name) {
        this.name = name;
    }



    public C getCounter() {
        return counter;
    }

    public N getName() {
        return name;
    }

    public S getSurname() {
        return surname;
    }

    public static void main(String[] args) {
         Container container = new Container();
        container.setCounter(1);
        container.setName("Vasya");
        container.setSurname("Pupkin");
    }

}
