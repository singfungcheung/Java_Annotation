public class CreatingAnnotations
{
    public static void main(String[] args)
    {
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

        if(myCat.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("This thing is very important!");
        }
        else
        {
            System.out.println("This thing is not very important!");
        }
    }
}
