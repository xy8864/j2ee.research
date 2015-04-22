package j2ee.research.struts2.dao;

import java.util.List;

import j2ee.research.struts2.domain.StudentEntity;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 23:11
 * To change this template use File | Settings | File Templates.
 */
public interface StudentMapper{
	public StudentEntity getStudent(Long id);
	public StudentEntity getStudentAndClass(String studentID);
	public List<StudentEntity> getStudentAll();
	public void insertStudent(StudentEntity entity);
	public void deleteStudent(StudentEntity entity);
	public void updateStudent(StudentEntity entity);
}
