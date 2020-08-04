package le08;

import le07.StudentSelectService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String[] applicationContext = {"classpath:appContext01.xml", "classpath:appContext02.xml", "classpath:appContext03.xml"};
		GenericXmlApplicationContext ctx01 = new GenericXmlApplicationContext(applicationContext);
		StudentSelectService studentSelect = ctx01.getBean("studentSelect", StudentSelectService.class);

		GenericXmlApplicationContext ctxImport = new GenericXmlApplicationContext("classpath:appContextImport.xml");
		StudentSelectService studentSelectService = ctxImport.getBean("studentSelect", StudentSelectService.class);

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		InjectionBean injectionBean = ctx.getBean("injectionBean", InjectionBean.class);
		DependencyBean dependencyBean1 = ctx.getBean("dependencyBean", DependencyBean.class);
		DependencyBean dependencyBean2 = ctx.getBean("dependencyBean", DependencyBean.class);

		if(dependencyBean1.equals(dependencyBean2)){
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}


	}
}
