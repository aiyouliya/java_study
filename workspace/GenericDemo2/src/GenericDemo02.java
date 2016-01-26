/*
 * 构造方法在泛型类中的使用
 */
class Con2<T>{
	private T valueT;
	public Con2(T value){
		this.valueT = value;
	}
	public void setValueT(T valueT) {
		this.valueT = valueT;
	}
	public T getValueT() {
		return valueT;
	}
}


public class GenericDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Con2<String> c = new Con2<String>("constuct method using in generic!");
		System.out.print(c.getValueT());
	}

}
