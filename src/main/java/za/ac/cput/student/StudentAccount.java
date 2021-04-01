/* StudentFeeAccount.java
 * The following class is the blueprint of the main class called StudentFeeAccountTest.java
 * Andrea Jacobs 218024266 */

package za.ac.cput.student;

public class StudentAccount 
{
    public int stuNumber;
    public String stuName;
    public String stLastName;
    public String stuCourse;
    public int year;
    public double stuAccBalance;

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getStuAccBalance() {
        return stuAccBalance;
    }

    public void setStuAccBalance(double stuAccBalance) {
        this.stuAccBalance = stuAccBalance;
    }

    @Override
    public String toString() {
        return "StudentAccount{" + "stuNumber=" + stuNumber + ", stuName=" + 
                stuName + ", stLastName=" + stLastName + ", stuCourse=" + 
                stuCourse + ", year=" + year + ", stuAccBalance=" + stuAccBalance + '}';
    }
    
    
    
}
