// Since java does not have template feature, we use some hacks to just make it compile.
public class Singleton {
    private static Singleton instance;

    private static Singleton createInstance(){

        return new Singleton();

    }

    @SuppressWarnings("unchecked")
    public static <T> T getInstance(){
        if(instance == null){
            instance = createInstance();
        }
        return (T) instance;
    }
}
