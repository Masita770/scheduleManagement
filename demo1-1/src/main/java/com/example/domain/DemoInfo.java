package com.example.domain;

public class DemoInfo {
	
	private int id;
	private String name;
	private int age;
	
	public void DemoInfo(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	/**
	 * IDを取得する
	 * @return　ID
	 */
	public int getId() {
		return id;
	}
	/**
	 * IDを設定する
	 * @param id　ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 名前を取得する
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前を設定する
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
