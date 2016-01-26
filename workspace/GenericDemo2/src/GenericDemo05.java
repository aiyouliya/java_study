/*
 * 接口中应用 泛型
 */
interface GinInter<T>{	//定义一个泛型接口
	public void say();
}
class Gin<T> implements GinInter<T>{	//定义一个泛型的类，继承接口也是泛型
	private String info;
	public Gin(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {	//定义一个构造方法，传一个参数
		this.info = info;
	}
	@Override
	public void say() {		//重写接口中的方法
		
	}
	
}
public class GenericDemo05 {

	public static void main(String[] args) {
		Gin<String> g = new Gin<String>("叶子");	//实例化时定义类的数据类型
		System.out.println(g.getInfo());
	}

}
