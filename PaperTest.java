package ems;
public class PaperTest {
 public static void main(String[] args) {
     //first object
      DateAndTime d1=new DateAndTime(2,3,2020,9,0);
      Paper p1=new Paper(123,12333,49);
      p1.setPaperTitle("prog");
      p1.setPaperID(123);
      p1.setCourseCode(12333);
      p1.setInvigilator("SanaUllah");
      p1.setSemester("fall 2020");
      p1.setDateAndTime(d1);
      p1.setExamType("final");
      p1.setIncharge("Ali zeb");
      p1.setLocation("kohat");
      p1.setStudents(59);
      p1.setIsCollected(false);
      p1.setResult(false);
      p1.setProgramName("BCS");
      System.out.print(p1+"\n");
      
      //2nd object
      DateAndTime d2=new DateAndTime(2,3,2020,9,0);
      Paper p2=new Paper(123,12333,49);
      p1.setPaperTitle("intro");
      p1.setPaperID(123);
      p1.setCourseCode(12333);
      p1.setInvigilator("SanaUllah");
      p1.setSemester("fall 2020");
      p1.setDateAndTime(d2);
      p1.setExamType("mid term");
      p1.setIncharge("Ali zeb");
      p1.setLocation("kohat");
      p1.setStudents(70);
      p1.setIsCollected(false);
      p1.setResult(false);
      p1.setProgramName("BCS");
      System.out.print(p1+"\n");
      
      //3rd object
      DateAndTime d3=new DateAndTime(2,3,2020,9,0);
      Paper p3=new Paper(123,12333,49);
      p1.setPaperTitle("DLD");
      p1.setPaperID(123);
      p1.setCourseCode(12333);
      p1.setInvigilator("Ilyas");
      p1.setSemester("fall 2020");
      p1.setDateAndTime(d3);
      p1.setExamType("final");
      p1.setIncharge("ShafiUllah");
      p1.setLocation("kohat");
      p1.setStudents(49);
      p1.setIsCollected(false);
      p1.setResult(false);
      p1.setProgramName("BCS");
      System.out.print(p1+"\n");
      
      
    }
    
}
