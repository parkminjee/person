package person;

public class Student extends Person{
	public Student(){
		System.out.println("call Student()");
	}
	public void set(){
		age = 30;
		name = "홍길동";
		height=175;
//		weight=65;
	}
	

}
