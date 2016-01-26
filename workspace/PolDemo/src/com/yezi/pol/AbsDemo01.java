package com.yezi.pol;

/*
 * Declare a abstract class People
 */
abstract class  People{
	private String name;
	private int age;
	public People(int age,String name){	//构造方法，传参用。有几个属性传几个参数
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void want();	//定义一个未实现的抽象方法，需在子类中实现
}

/*
 * Declare a class Student extends People.
 */
class Studend extends People{
	private int score;
	
	public Studend(int age, String name,int score) {//重写抽象类中的构造方法
		/*
		 * this.name = name;
		 * this.age = age;
		 * 可以用super(name,age);代替
		 */
		super(age, name);
		this.score = score;
	}

	@Override
	public void want() {	//重写抽象父类中的方法，需实现该方法
		System.out.println("姓名："+getName()+"年龄："+getAge()+"成绩："+getScore());
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}


/*
 * Declare a class Student extends People.
 */
class Worker extends People{
	private int salary;
	
	public Worker(int age, String name,int salary) {//重写抽象类中的构造方法。
		super(age, name);
		this.salary = salary;
	}

	@Override
	public void want() {	//重写抽象父类中的方法，需实现该方法
		System.out.println("姓名："+getName()+"年龄："+getAge()+"薪资："+getSalary());
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}

/*
 * 主函数
 */
public class AbsDemo01 {

	public static void main(String[] args) {
		Studend s = new Studend(10, "椰子", 100);
		s.want();
		Worker w = new Worker(30, "HELLEN", 1000);
		w.want();

	}

}
