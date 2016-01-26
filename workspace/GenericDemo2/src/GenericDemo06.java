/*
 * 泛型数组定义时，可以定义一个泛型
 * 实例化时可以为任意类型
 */
public class GenericDemo06 {

	public static void main(String[] args) {
		Integer arr[]={1,2,3,4};	//实例化为整型
		tell(arr);
		String arr1[] = {"yezi","jamy","yih","boh"};	//实例化为字符串数组
		tell(arr1);
	
}
	public static <T> void tell(T arr[]){	//定义一个泛型方法 ，传一个泛型数组
		for(int i = 0 ; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
