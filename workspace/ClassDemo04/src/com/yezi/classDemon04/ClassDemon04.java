package com.yezi.classDemon04;

class Pepole{
	private int age;
	private String name;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(0 <= age && age <= 150){
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	}

public class ClassDemon04 {
	public void main(String[] args) {
		Pepole pep1 = new Pepole();
		pep1.setAge(300);
		System.out.print(pep1.getAge());
	}

	}

