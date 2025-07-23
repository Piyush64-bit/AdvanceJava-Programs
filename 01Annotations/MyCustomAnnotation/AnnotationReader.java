package MyCustomAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) {
        try {
            // get the class
            Class<?> cls = MyClass.class;
            // read field annotations

            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Info.class)) {
                    Info info = field.getAnnotation(Info.class);
                    System.out.println("Field: " + field.getName());
                    System.out.println("Author: " + info.author());
                    System.out.println("Description: " + info.description());
                }
            }
            // read method annotation
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Info.class)) {
                    Info info = method.getAnnotation(Info.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Author: " + info.author());
                    System.out.println("Description: " + info.description());
                }           
            }

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
