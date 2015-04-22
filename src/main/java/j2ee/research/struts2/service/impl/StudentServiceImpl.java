package j2ee.research.struts2.service.impl;

import java.util.List;

import j2ee.research.struts2.dao.StudentMapper;
import j2ee.research.struts2.domain.StudentEntity;
import j2ee.research.struts2.service.StudentService;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 23:21
 * To change this template use File | Settings | File Templates.
 */
public class StudentServiceImpl implements StudentService{
	private StudentMapper studentMapper;

	public void setStudentMapper(StudentMapper studentMapper){
		this.studentMapper=studentMapper;
	}

	@Override
	public StudentEntity getStudent(Long id){
		if(id==null||id<1)return null;
		return studentMapper.getStudent(id);
	}

	@Override
	public StudentEntity getStudentAndClass(String studentID){
		return null;
	}

	@Override
	public List<StudentEntity> getStudentAll(){
		return null;
	}

	@Override
	public void insertStudent(StudentEntity entity){

	}

	@Override
	public void deleteStudent(StudentEntity entity){

	}

	@Override
	public void updateStudent(StudentEntity entity){

	}
}
