package com.example.domain;

public class DemoInfo {
	
	private Integer id;
	private String name;
	private String age;
	
//	public void DemoInfo(Integer id, String name, Integer age) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	
	

	/**
	 * IDを取得する
	 * @return　ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * IDを設定する
	 * @param id　ID
	 */
	public void setId(Integer id) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
