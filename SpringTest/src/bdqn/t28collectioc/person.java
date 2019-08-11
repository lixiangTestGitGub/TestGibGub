package bdqn.t28collectioc;

import java.util.List;
import java.util.Map;

import bdqn.t28.Car;

public class person {

	private String name;
	private int  age;
	private String sex;
	private  List<Car> cars;
	private Map<String,Car>map;

	public Map<String, Car> getMap() {
		return map;
	}

	public void setMap(Map<String, Car> map) {
		this.map = map;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}


	public person() {
		super();
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				", cars=" + cars +
				", map=" + map +
				'}';
	}

	public person(String name, int age, String sex, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.cars = cars;
}
	
	
	
	
	
}
