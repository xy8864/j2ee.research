package j2ee.research.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**  
 * @author yuanwei  
 * @version ctreateTime:2011-8-22 下午6:00:19
 *   
 */
public class Spring2Controller implements Controller{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("name:"+getName());
		int[] a=new int[10];System.out.println(a[2]);
		Integer[] b=new Integer[10];System.out.println(b[2]);
		//int c;System.out.println(c);
		return null;
	}

}
