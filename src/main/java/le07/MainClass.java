package le07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		StudentDao studentDao = ctx.getBean("studentDao",StudentDao.class);
		StudentSelectService studentSelect = ctx.getBean("studentSelect", StudentSelectService.class);
		StudentAllSelectService studentAllSelect = ctx.getBean("studentAllSelect", StudentAllSelectService.class);
		StudentDeleteService studentDelete = ctx.getBean("studentDelete", StudentDeleteService.class);
		StudentRegisterService studentRegister = ctx.getBean("studentRegister", StudentRegisterService.class);
		StudentModifyService studentModify = ctx.getBean("studentModify", StudentModifyService.class);

	}
}
