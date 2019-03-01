

public class Student {
	private String name;
	private int age;
	private boolean sex;
	private int score;
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
	public String isSex() {
		if(this.sex)
			return "男";
		else 
			return "女";
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
		
	}
	public Student(String name,int age,boolean sex,int score) {
		setName(name);
		setAge(age);
		setSex(sex);
		setScore(score);
	}
	public boolean equals(Student stu) {
		if(	this.sex == stu.sex 	&&
			this.name == stu.getName()	&&
			this.score == stu.getScore()&&
			this.age == stu.getAge()) 
			
			return true;
		else 
			return false;
			
	}
		
	public static void main(String[] args) {
		Student stu01 = new Student("诸葛亮",46,true,120);
		Student stu02 = new Student(stu01.getName(),stu01.getAge(),stu01.sex,stu01.getScore());
		Student stu03 = new Student("诸葛亮",46,true,120);
		
		
		if(stu01.equals(stu02) == true) {
			System.out.println("stu01等于stu02");
		}
		if(stu01.equals(stu03) == true) {
			System.out.println("stu01等于stu03");
		}
		
	}
}
