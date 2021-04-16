public class Item <T> {
	
	T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}