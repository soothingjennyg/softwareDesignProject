import java.lang.reflect.InvocationTargetException;

public class Singleton {

    private static Singleton instance;

    @SuppressWarnings("unchecked")
    public static <T extends Singleton> T getInstance(Class<T> instanceClass) {

        if (instance == null) {
            try {
                instance = instanceClass.getDeclaredConstructor().newInstance();
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {

            }
        }
        return (T) instance;
    }

}
