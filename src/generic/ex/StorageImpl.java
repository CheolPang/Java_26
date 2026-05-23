package generic.ex;

public class StorageImpl<T> implements Storage<T> {

	private T[] array;

	public StorageImpl(int capacity) {
		super();
		this.array = (T[]) new Object[capacity];
		System.out.println(array.length + "개 구매가능");
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
		System.out.println("구매필요 제품 " + (index + 1) + "번 째로 구매하고 구매목록을 저장했음");
	}

	@Override
	public int get(T item, int index) {
		array[index] = item;
		return index;
	}

}
