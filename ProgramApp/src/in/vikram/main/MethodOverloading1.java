package in.vikram.main;

class Student{
	int sid;
	String name;
	String course;
	
	String play() {
		System.out.println("Games");
		return "games";
	}
	
	void play(String p1, String p2) {
		System.out.println(p1+ " " +p2);
	}
	
}
public class MethodOverloading1 {
   public static void main(String[] args) {
	   Student s1 = new Student();
	   s1.play();
	   Student s2 = new Student();
	   s2.play("Cricket", "Football");
   }
}
