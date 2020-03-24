package ems;
public class Paper {
   private String paperTitle;
   private int paperID;
   private int courseCode;
   private String invigilator;
   private String semester;
   private String programName;
   private DateAndTime dateAndTime;
   private String examType;
   private String incharge;
   private String location;
   private int students;
   private boolean isCollected;
   private String result;

    public Paper(int paperID, int courseCode, int students) {
        this.paperID = paperID;
        this.courseCode = courseCode;
        this.students = students;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public void setPaperID(int paperID) {
        this.paperID = paperID;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public void setIsCollected(boolean isCollected) {
        this.isCollected = isCollected;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public int getPaperID() {
        return paperID;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getSemester() {
        return semester;
    }

    public String getProgramName() {
        return programName;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public String getExamType() {
        return examType;
    }

    public String getIncharge() {
        return incharge;
    }

    public String getLocation() {
        return location;
    }

    public int getStudents() {
        return students;
    }

    public boolean isIsCollected() {
        return isCollected;
    }
   public void setResult(boolean isCollected)
   {
       if(isCollected==true)
           result="collected";
       else
           result="not collected";
       
       
   }

    public String getResult() {
        return result;
    }
   @Override
   public String toString()
{
    return ("paper name: "+paperTitle+"\nPaperID: "+paperID+"\ncourse code: "+courseCode+"\ninvagilator: "+invigilator+"\nsemester: "+semester+"\nprograme: "+programName+"\ndate and time: "+dateAndTime+"\nexam type: "+examType+"\nlocation: "+location+"\nincharge: "+incharge+"\ntotal students: "+students+"\nis collected"+isCollected);
}
}
