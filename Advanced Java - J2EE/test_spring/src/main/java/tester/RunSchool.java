package tester;
import dependency.*;
import dependent.School;
public class RunSchool implements School {
	private Teacher subjectTeacher=new MathsTeacher();
	private Coach sportCoach;
	
	public void setSportCoach(Coach sportCoach) {
		System.out.println("Sport Coach");
		this.sportCoach = sportCoach;
		
	}
	public RunSchool() {
		System.out.println("In Constructor="+getClass());
	}
	@Override
	public void manageAcademics() {
		System.out.println("Managing Academic here-");
		subjectTeacher.teach();
		
	}
	public void organizeSportsEvent() {
		// TODO Auto-generated method stub
		
	}


}
