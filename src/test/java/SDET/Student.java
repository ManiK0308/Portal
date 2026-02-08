package SDET;

public class Student {
	
	String Sname;
	int Rollno;
	int Section;
	int Marks;
	
	public void printstudentdata() {
		System.out.println(Sname + Rollno + Section + Marks);
	}
	
	public void setstudentdata(String S_name, int Roll_no, int section_, int Marks_)
	{
		String Sname = S_name;
		int Rollno = Roll_no;
		int Section = section_;
		int Marks = Marks_;
	}
	
	Student(	String Sname,
	int Rollno,
	int Section,
	int Marks)
	{
	 this.Sname= Sname;
	 this.Rollno= Rollno;
	 this.Section=Section;
	 this.Marks= Marks;

	}
}
