//Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.

package Day_7.Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Use_of_reflection {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Day_7.Reflection.Person");
            System.out.println("Class name: " + cls.getName());
           System.out.println();
            Method[] methods = cls.getDeclaredMethods();
            for(Method m : methods){
                System.out.println("Method name: " + m.getName() +"   |  Return type:"+ m.getReturnType());
            }
            System.out.println();
            Field[] fields = cls.getDeclaredFields();
            for(Field f : fields){
                System.out.println("Field name: " + f.getName() +"   |  Return type:"+ f.getType());
            }
            System.out.println();
            Constructor[] constructors = cls.getDeclaredConstructors();
            for(Constructor c : constructors){
                System.out.println("Constructor name: " + c.getName());
            }
            System.out.println();

            try
            {
            Person p = (Person) constructors[0].newInstance(10,"Raj");
            System.out.println("Created Person: " + p);

           for(int i=0; i<methods.length; i++) {
               if (methods[i].getName().equals("getId")) {
                   methods[i].setAccessible(true);
                   Object result = methods[i].invoke(p);
                   System.out.println("Result :" + result);
               }
           }
           }
            catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
                e.printStackTrace();

           }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
