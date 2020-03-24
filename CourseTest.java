
package ems;

public class CourseTest {

    public static void main(String[] args) {
        //1st object
        Course one=new Course("java",123);
        one.setCourseCode(123);
        one.setProgramName("BCS");
        one.setSemester("fall 2020");
        System.out.println(one+"\n");
        //2nd object
   
        Course two=new Course("java",123);
        two.setCourseCode(123);
        two.setProgramName("BCS");
        two.setSemester("fall 2020");
        System.out.println(two+"\n");
        
        //3rd object
        Course three=new Course("java",123);
        three.setCourseCode(123);
        three.setProgramName("BCS");
        three.setSemester("fall 2020");
        System.out.println(three+"\n");
        System.out.print("total number of Students: "+Course.getCount());
        
    }
    
}
