package j2ee.research.struts2.webapp.listener;

import javax.servlet.ServletContextEvent;
import org.springframework.web.context.ContextLoaderListener;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-08 13:51
 * To change this template use File | Settings | File Templates.
 */
public class StartupContextLoaderListener extends ContextLoaderListener{
	@Override
	public void contextInitialized(ServletContextEvent event){
		super.contextInitialized(event);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event){
		super.contextDestroyed(event);
	}
}
