class subject{
	
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public subject(String subID, String name, int maxMarks, int marksObtain){
		this.subID=subID;
		this.name=name;
		this.maxMarks=maxMarks;
		this.marksObtain=marksObtain;
		
	}
	
	public String getsubID(){
		return subID;
	}
	public String getname() {
		return name;
	}
	public int getmaxMarks() {
		return maxMarks;
	}
	public int getmarksObtains() {
		return marksObtain;
	}
	
	public void setMaxMarks(int mm) {
		maxMarks=mm;
	}
	public void setmarksObtains(int m) {
		marksObtain=m;
	}
	
	public boolean isQualified() {
		return marksObtain>=maxMarks/10*4;
	}
	public String toString() {
		return "\nSubject:"+subID+"\nName:"+name+"\nMarks Obtained:"+marksObtain;
	}
	
}

public class allconceptsincludedprogram {
public static void main(String[] args) {
	
	subject subs[]= new subject[3];
	subs[0]=new subject("101","DS",100,80);
	subs[1]=new subject("102","Java",100,90);
	subs[2]=new subject("103","c++",100,95);
	
	for(subject s:subs)
		System.out.println(s);
		
}
}	




//    
//    public String getSubID(){return subID;}
//    public String getName(){return name;}
//    public int getMaxMarks(){return maxMarks;}
//    public int getMarksObtains(){return marksObtains;}
//    
//    public void setMaxMarks(int mm)
//    {
//        maxMarks=mm;
//    }
//    
//    public void setMarksObtain(int m)
//    {
//        marksObtains=m;
//    }
//    
//    boolean isQualified()
//    {
//        return marksObtains>=maxMarks/10*4;
//    }
//    
//    public String toString()
//    {
//        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
//    }
//    
//}
//
//public class allconceptsincludedprogram {
//
//    public static void main(String[] args) 
//    {
//        Subject subs[]=new Subject[3];
//        subs[0]=new Subject("s101","DS",100);
//        subs[1]=new Subject("s102","Algorithms",100);
//        subs[2]=new Subject("s103","Operating Systems",100);
//        
//        for(Subject s:subs)
//            System.out.println(s);
//    }
//    
//}
