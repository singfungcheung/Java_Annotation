import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations
{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // Annotations are meta-data that describes the code. It has no effect
        // on the code, but it can be processed by the compiler.

        // All anotations start with @ followed by name with parameters (some are required)
        // like the one below. Always put it right before the thing you want to annotate.
        /*
        @SuppressWarnings("unused")
        int x = 5;
        @SuppressWarnings("unused")
        int y = 6;
        */

        Cat myCat = new Cat("Wonyoung");
        Dog myDog = new Dog("Benji");
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("This thing is very important!");
        }
        else
        {
            System.out.println("This thing is not very important!");
        }

        if(myDog.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("This thing is very important!");
            myDog.bark();
        }
        else
        {
            System.out.println("This thing is not very important!");
            myDog.bark();
        }

        for (Method method : myCat.getClass().getDeclaredMethods())
        {
            if(method.isAnnotationPresent(RunImmediately.class))
            {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                for (int i = 0; i < annotation.times(); i++)
                {
                    method.invoke(myCat);
                }
            }
        }
    }
}
