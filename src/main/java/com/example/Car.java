package com.example;

/**
 * 車のドメイン
 * @author igayuki
 *
 */
public class Car {
	
	/**
	 * Carのスピード
	 */
	private Integer speed;
	
	/**
	 * Carの名前
	 */
	private String name;
	
	
	/**
	 * 引数なしコンストラクタ
	 */
	public Car() {
		super();
	}
	
	/**
	 * 引数ありのコンストラクタ
	 * @param speed
	 * @param name
	 */
	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}

	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}
	
	

}
