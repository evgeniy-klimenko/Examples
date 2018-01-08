package ExeptionDZ.ThreeClassesOfExeptions;


public class Program {


    void throwable() throws MyUncheckedExeption{
        try (AutoCloseable autoCloseable = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                Worker worker = new Worker();
                worker.work();
            }
        }) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void main(String[] args) {
       Program program = new Program();
        program.throwable();
    }

}
