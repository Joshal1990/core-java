package oops.concepts;

public class EncapsulationTest {

  //data member should be private so that other classes can't access directly.
	private String name;
	private Integer age;
	private String sex;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
