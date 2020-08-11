package le12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClassUseConfig {
	public static void main(String[] args) {

//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContextXmlToJava.xml");
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig1.class, MemberConfig2.class, MemberConfig3.class);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig1.class);

		StudentDao studentDao = ctx.getBean("studentDao",StudentDao.class);
		StudentSelectService studentSelect = ctx.getBean("studentSelect", StudentSelectService.class);
		StudentAllSelectService studentAllSelect = ctx.getBean("studentAllSelect", StudentAllSelectService.class);
		StudentDeleteService studentDelete = ctx.getBean("studentDelete", StudentDeleteService.class);
		StudentRegisterService studentRegister = ctx.getBean("studentRegister", StudentRegisterService.class);
		StudentModifyService studentModify = ctx.getBean("studentModify", StudentModifyService.class);
		ctx.close();

	}
}
