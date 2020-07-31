package le05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		1)java 프로젝트에서 객체를 생성하는 방법
//		생성자 호출해서 메모리 로드
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();


//		2)스프링 프레임워크에서 객체를 생성하는 방법
//		컨테이너에 생성된 빈에 접근하는 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

//		생성된 빈을 지정하여 가져와 원하는 기능을 사용
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();

		ctx.close();
	}
}
