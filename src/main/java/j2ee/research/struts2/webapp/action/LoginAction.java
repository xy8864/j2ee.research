package j2ee.research.struts2.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import j2ee.research.struts2.domain.User;
import j2ee.research.struts2.service.StudentService;
import j2ee.research.struts2.service.UserService;
import j2ee.research.struts2.util.Validates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-08 00:21
 * To change this template use File | Settings | File Templates.
 *
 */
public class LoginAction extends ActionSupport{
	private static final Logger log = LoggerFactory.getLogger(LoginAction.class);
	private User user=new User();
	private UserService userService;
	private StudentService studentService;
	private String[] habits;

	public void setUserService(UserService userService){
		this.userService=userService;
	}

	public void setStudentService(StudentService studentService){
		this.studentService=studentService;
	}

	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
	public String[] getHabits () {
		return habits;
	}
	public void setHabits (String[]habits) {
		this. habits= habits;
	}
	@Override
	public String execute() throws Exception{
		log.debug("Entering execute...");
		//log.debug("student:{}",studentService.getStudent(1L));
		log.debug("user={}",user);
		if(user==null)return INPUT;

		user=userService.login(user);
		if(user!=null){
			return SUCCESS;
		}else{
			this.addActionError("账号或密码不正确");
		}
		//Validates.addFieldError(this,"username_password","账号或密码不正确", true  );

		return INPUT;
	}
	public void validate(){
		log.debug("Entering validate ...");
		if(user==null){
			Validates.addFieldError(this,"password","请输入账号和密码", true  );
			return;
		}
		Validates.addFieldError(this,"username","帐号长度必须在5位以上", user.getUsername()==null || user.getUsername().trim().length()<5  );
		Validates.addFieldError(this,"password","密码长度必须在6位以上", user.getPassword()==null || user.getPassword().trim().length()<6  );
		//Validates.addFieldError(this,"username","账号或密码不正确", !("admin123".equals(user.getUsername()) && "admin123".equals(user.getPassword()))  );


		log.debug("hasFieldErrors:{}",hasFieldErrors());
	}

}
