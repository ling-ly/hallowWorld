public class Hello {
	public static void main(String args[]){
		System.out.println("��Һã�");
		System.out.println("Nice to meet you");
		Student stu = new Student();
		stu.speak("We are student");
	}
}
class Student {
	public void speak(String s ){
		System.out.println(s);
	}
}