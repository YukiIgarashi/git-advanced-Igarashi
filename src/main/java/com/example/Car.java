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
	private String lastName;
	
	
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
	public Car(Integer speed, String lastName) {
		super();
		this.speed = speed;
		this.lastName = lastName;
	}

	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getName() {
		return lastName;
	}
	public void setName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", lastName=" + lastName + "]";
	}
	
	

}
