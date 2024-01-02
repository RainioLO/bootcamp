package lambda;

public interface CommonConsumer<T> extends SuperConsumer<T, T, T> { // even extends, aslso one method, functional interface
// void except (T t1, T t2, T t3); extend from SuperConsumer

}
