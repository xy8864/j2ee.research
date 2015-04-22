package j2ee.research.struts2.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 23:01
 * To change this template use File | Settings | File Templates.
 */
public class StudentEntity extends Identity{
	private static final long serialVersionUID = 3096154202413606831L;
	private Date studentBirthday;
	private String studentID;
	private String studentName;
	private String studentSex;

	public Date getStudentBirthday() {
		return studentBirthday;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentBirthday(Date studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	@Override
	public String toString(){
		return "StudentEntity{"+
				"studentBirthday="+studentBirthday+
				", studentID='"+studentID+'\''+
				", studentName='"+studentName+'\''+
				", studentSex='"+studentSex+'\''+
				'}';
	}
}
