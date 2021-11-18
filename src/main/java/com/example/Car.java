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
	private String firstName;
	
	
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
	public Car(Integer speed, String firstName) {
		super();
		this.speed = speed;
		this.firstName = firstName;
	}

	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getName() {
		return firstName;
	}
	public void setName(String name) {
		this.firstName = name;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", firstName=" + firstName + "]";
	}
	
	

}
