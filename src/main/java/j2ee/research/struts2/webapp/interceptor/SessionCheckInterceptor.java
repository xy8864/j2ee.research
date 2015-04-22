package j2ee.research.struts2.webapp.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import j2ee.research.struts2.Constant;

public class SessionCheckInterceptor implements Interceptor{
	//设置参数
	private String sessionAttribute;
	private String reLoginResult;
	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}
	public void setReLoginResult(String reLoginResult) {
		this.reLoginResult = reLoginResult;
	}
	public void destroy() { }
	public void init() {    }
	public String intercept(ActionInvocation invocation) throws Exception {
		//读取Session
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		//判断Session中是否有相应的attribute
		if(sessionAttribute==null)sessionAttribute=Constant.SESSION_LOGIN_KEY;
		if (session.containsKey(sessionAttribute)){
			String resultCode = invocation.invoke();
			return resultCode;
		}else{
			return reLoginResult;
		}
	}
}
