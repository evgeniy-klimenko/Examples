package IODZ.Serialization;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Holder holder = new Holder("Hello");
        Class<? extends Holder> holderClass = holder.getClass();

        for (Method method : holderClass.getMethods()){
            System.out.println(method.getName());
        }
        Method holdermethod =  holderClass.getDeclaredMethod("show", int.class);
        System.out.println(holdermethod.getName());
        holdermethod.setAccessible(true);
        holdermethod.invoke(holder, 5);



    }
}
