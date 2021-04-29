package extension;

/**
 * @author hawdies
 * @date 2021/4/29
 **/
public class Holder<T> {
    private volatile T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
