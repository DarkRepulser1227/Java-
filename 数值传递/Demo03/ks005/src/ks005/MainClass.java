package ks005;

public class MainClass {
	interface Person{
		public void setDate(String n,String name,String sex);
	}
	class Student implements Person{
		String n;
		String name;
		String sex;
		public void setDate(String n,String name,String sex) {
			this.n = n;
			this.name = name;
			this.sex = sex;
		}
		public String introduce() {
			return this.n+this.name+this.sex;
		}
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		Student stu = mc.new Student();
		stu.setDate("01", "¸ß×Ü", "male");
		System.out.println(stu.introduce());
	}

}
