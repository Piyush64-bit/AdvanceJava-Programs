package MyCustomAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // This makes the annotation available at runtime.
@Target({ElementType.METHOD, ElementType.FIELD}) // This allows annotations for both functions and variables

public @interface Info {
    String author();
    String description() default "No description provided";

}

// a> @Retention (___) -> this will be needed for the Java Reflection API to work.
// b> author () -> it is a required parameter
// c> description () -> optional parameter