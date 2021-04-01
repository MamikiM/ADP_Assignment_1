/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentcheck;

/**
 * 217284205
 * @author Aquilla Williams
 */
public class StudentRoom {
    
    private String studentName ;
    private String studentCode;
    private String studentRoomNum;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentRoomNum() {
        return studentRoomNum;
    }

    public void setStudentRoomNum(String studentRoomNum) {
        this.studentRoomNum = studentRoomNum;
    }

    @Override
    public String toString() {
        return "StudentRoom{" + "studentName=" + studentName + ", studentCode=" + studentCode + ", studentRoomNum=" + studentRoomNum + '}';
    }
    
            
    
}
