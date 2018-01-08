package Collections.enumer.DZCollection.InnerClasses;


public final class Executors {

    private String s = "Executors";

    //STATIC NESTED CLASS
    static class NestedExecutor implements Executable{
        @Override
        public String execute() {
            return "Nested Class";
        }
    }

    //LOCAL CLASS
      class LocalExecutor implements Executable{

        @Override
        public String execute() {
            return "Local Class";
        }
    }

    //INNER CLASS
    class InnerExecutor implements Executable{

        @Override
        public String execute() {
            return s + "Inner Class";
        }
    }

    InnerExecutor getInnerExecutor(){
        return new InnerExecutor();
    }
    public static void main(String[] args) {

        Executors.NestedExecutor ne = new Executors.NestedExecutor();
        System.out.println(ne.execute());//NESTED OUT

        //ANONYMOUS CLASS
        String anonymousexecutor = new Executable() {
            @Override
            public String execute() {
                return "Anonymous Class";
            }
        }.execute();
        System.out.println(anonymousexecutor);//ANONYMOUS OUT

        Executors e = new Executors();
        Executors.LocalExecutor le = e.new LocalExecutor();
        System.out.println(le.execute());//LOCAL OUT

        Executors ee = new Executors();
        Executors.InnerExecutor ie = ee.getInnerExecutor();
        System.out.println(ie.execute());

    }
}
