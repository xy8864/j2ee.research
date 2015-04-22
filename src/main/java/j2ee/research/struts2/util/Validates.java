package j2ee.research.struts2.util;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-08 16:28
 * To change this template use File | Settings | File Templates.
 */
public class Validates{
	public static void addFieldError(ActionSupport action,String fieldName, String errorMessage,boolean check){
		if(check)
			action.addFieldError(fieldName,errorMessage);
	}
	public static void addFieldErrorByKey(ActionSupport action,String fieldName,boolean check, String key,String[] args){
		if(check)
			action.addFieldError(fieldName,action.getText(key));
	}
}
