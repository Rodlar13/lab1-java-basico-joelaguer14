package cr.una.lab1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Main Class
 */
public class CourseSession {

    private static int WEEKS_PER_PERIOD=16;
    private static int DAYS_PER_WEEK=7;
    private static int SUBSTRACTED_DAYS=7;
    /**
     *
     */
    private String department;
    /**
     *
     */
    private String code;
    /**
     *
     */
    private Date startDate;
    /**
     *
     */
    private ArrayList<Student> students;

    /**
     *
     * @param department
     * @param code
     * @param startDate
     */
    CourseSession(String department, String code, Date startDate){
        this.department=department;
        this.code=code;
        this.startDate=startDate;
        students=new ArrayList<>();
    }

    /**
    * @param student
    */
    public void enrollStudent(Student student){
        students.add(student);
    }
    public Date getEndDate(){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(startDate);
        int addDays=WEEKS_PER_PERIOD*DAYS_PER_WEEK-SUBSTRACTED_DAYS;
        calendar.add(Calendar.DATE,addDays);
        return calendar.getTime();
    }

    /**
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     *
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     *
     * @return
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return
     */
    public int getNumberOfStudents(){
        return students.size();
    }
}
