import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // Specify what type of element this annotation is valid for.
@Retention(RetentionPolicy.RUNTIME) // Keep this annotation during runtime.
public @interface VeryImportant {
}
