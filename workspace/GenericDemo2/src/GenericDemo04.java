/*
 * 通配符使用为 ?
 * 在使用泛型类时，在定义一个公共方法时，想在调用时使用任意数据类型时，可以使用通配符。
 */
class Info<T>{
	private T key;
	public void setKey(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return this.getKey().toString();
	}
}
public class GenericDemo04 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setKey("yezi");
		tell(i);		//因为tell定义时使用了通配符，所以这里可以使用任意类型,此处为String
		
		Info<Integer> i2 = new Info<Integer>();
		i2.setKey(100);
		tell(i2); 		//因为tell定义时使用了通配符，所以这里可以使用任意类型,此处为integer
	}
	/*
	 * 通配符 ： ？
	 */
	public static void  tell(Info<?> i) {	//不指定具体类型，则调用时可以为任意类型
		System.out.println(i);
		
	}

}
