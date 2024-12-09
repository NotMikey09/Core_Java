package abstraction;

public class StudentTest {

	public static void main(String[] args) {
		
System.out.println("(each subject is of 100 marks)");
Student student=null;
student=new ScienceStudent("Pratyush","12th", 90, 95, 80);
System.out.println("Science Student's percentage: "+student.getPercetngae()+"%");
student=new HistoryStudent("Rajendra","12th",90,80);
System.out.println("History Student Percentage:"+student.getPercetngae()+"%");

	}

}
