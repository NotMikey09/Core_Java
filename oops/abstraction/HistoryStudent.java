package abstraction;

public class HistoryStudent extends Student{
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass,int historyMarks,int civicstryMarks)
	{
		super(studentName,studentClass);
		this.historyMarks=historyMarks;
		this.civicsMarks=civicstryMarks;
	}

	@Override
	public int getPercetngae() {
		
		return (historyMarks+civicsMarks)/2;
	}

}
