package cn.zj.ssm.pojo;

public class User {
	private Integer id;//Field(字段)成员变量
	private String name;
	private String password;
	private Integer age;
	private String emial;
	
	
	
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	//确定属性 ：去掉get  剩余部分首字母变小写  ：id
	public Integer getId() {
		return id;
	}
	//确定属性 ：去掉set  剩余部分首字母变小写  ：id
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User(Integer id, String name, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
