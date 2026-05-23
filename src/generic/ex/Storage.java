package generic.ex;

public interface Storage<T> {
	public void add(T item, int index);
	public int get(T item, int index);
}
