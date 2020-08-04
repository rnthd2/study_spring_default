package le10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContextUseAutowired.xml");
		WordDao wordDao = ctx.getBean("wordDao", WordDao.class);
		WordRegisterService service = ctx.getBean("wordRegisterService", WordRegisterService.class);
	}
}
