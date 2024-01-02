package lambda;

public interface SuperConsumer<T, U, V> { // T U V, can be different or same type

  void accept(T t, U u, V v);

}
