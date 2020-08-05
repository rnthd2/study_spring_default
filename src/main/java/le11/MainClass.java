package le11;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContextLifeCycle.xml");
		BookRegisterService bookRegisterService = ctx.getBean("bookRegisterService",BookRegisterService.class);
		Member member = new Member("gildong", 20);
		bookRegisterService.register(new Book("abc", member));
		MemberRegisterService memberRegisterService = ctx.getBean("memberRegisterService",MemberRegisterService.class);
		memberRegisterService.register(member);
		ctx.close();

	}
}
