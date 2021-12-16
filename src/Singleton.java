import java.util.function.Supplier;

public class Singleton<T> {
    private T instance;

    private T createInstance(Supplier<T> supplier){

            return supplier.get();
    }

    public T getInstance(Supplier<T> supplier){
        if(this.instance == null){
            this.instance = createInstance(supplier);
        }
        return this.instance;
    }
}
