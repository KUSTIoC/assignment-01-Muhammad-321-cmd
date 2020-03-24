
package ems;

public class Course {
    private final String courseName;
    private int courseCode;
    private String programName;
    private String semester;
    private static int count;
    public Course(String courseName,int courseCode)
    {
        this.courseName=courseName;
        this.courseCode=courseCode;
        count++;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getProgramName() {
        return programName;
    }

    public String getSemester() {
        return semester;
    }
public static int getCount()
{
    return count;
}
public String toString()
{
    return ("course name: "+courseName+"\ncourse code: "+courseCode+"\nprogram name"+programName+"\nsemester: "+semester+"\n");
}
    
}
