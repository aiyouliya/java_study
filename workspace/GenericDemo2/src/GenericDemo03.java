/*
 * 指定多个泛型，在<>中可以添加多个泛型，传多个参数
 */
class Gen<T,K>{
	private T take;
	private K key;
	public T getTake() {
		return take;
	}
	public void setTake(T take) {
		this.take = take;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
}
public class GenericDemo03 {

	public static void main(String[] args) {
		Gen<String,Integer> g = new Gen<String,Integer>();
		g.setTake("key");
		g.setKey(10);
		System.out.println(g.getTake()+" "+ g.getKey());
	}

}
