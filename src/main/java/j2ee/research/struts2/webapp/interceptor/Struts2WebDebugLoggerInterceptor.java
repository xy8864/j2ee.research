package j2ee.research.struts2.webapp.interceptor;

import java.util.Map;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Struts2WebDebugLoggerInterceptor implements Interceptor{
	private static final Logger log = LoggerFactory.getLogger(Struts2WebDebugLoggerInterceptor.class);
	public void destroy() {
		log.debug("destroy...");
	}
	public void init() {
		log.debug("init...");
	}
	public String intercept(ActionInvocation invocation) throws Exception {
		log.debug("begin-------------------------------");
		log.debug("Action[{}],Method[{}]"
				,invocation.getAction().getClass().getName()//找到运行的Action对象，并打印其类名
				,invocation.getProxy().getMethod()//找到运行的ActionProxy对象，并打印其要运行的方法名
		);
		//找到运行的Action对象，并打印其类名
		///System.out.println("Action:"+invocation.getAction().getClass().getName());
		//找到运行的ActionProxy对象，并打印其要运行的方法名
		///System.out.println("Method:"+invocation.getProxy().getMethod());
		//找到这次请求的request中的parameter参数，并打印
		Map<String, Object> params = invocation.getInvocationContext().getParameters();
		StringBuffer buffer=new StringBuffer();
		for (String key:params.keySet()){
			Object obj = params.get(key);
			if(obj instanceof String[]){
				String[] arr = (String[]) obj;
				buffer.append(key).append('=');
				for (String value:arr){
					buffer.append(value).append(',');
				}
			}
		}
		log.debug(buffer.toString());

		//运行后续的拦截器、Action和Result
		String resultCode = invocation.invoke();

		//在Action和Result运行之后，得到Result对象
		//并且可以强制转换成ServletDispatcherResult，打印其下一个JSP的位置
		Result result = invocation.getResult();
		if (result instanceof ServletDispatcherResult){
			log.debug("struts.view_uri:{}",((ServletDispatcherResult) result).getLastFinalLocation());
		}

		log.debug("end-------------------------------");
		return resultCode;
	}
}
