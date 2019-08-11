package bdqn.t28;

public class person {

	private String name;
	private int  age;
	private String sex;
	private Car car;
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
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", sex=" + sex + ", car=" + car + "]";
	}
	public person(String name, int age, String sex, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.car = car;
	}
	public person() {
		super();
	}
	
	
	
	
}
