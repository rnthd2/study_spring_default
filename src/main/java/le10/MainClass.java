package le10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContextUseAutowired.xml");
		WordRegisterService service = ctx.getBean("wordRegisterService2", WordRegisterService.class);
	}
}
