//package le12;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////xml설정파일과 동일한 파일로 취급한다
//@Configuration
//public class MemberConfig {
//
////	<bean id="studentDao" class="le12.StudentDao"/>
//	@Bean
//	public StudentDao studentDao(){
//		return new StudentDao();
//	}
//
//	/*<bean id="studentRegister" class="le12.StudentRegisterService">
//        <constructor-arg ref="studentDao"/>
//    </bean>*/
//	@Bean
//	public StudentRegisterService studentRegister(){
//		return new StudentRegisterService(studentDao());
//	}
//
//	/*<bean id="studentSelect" class="le12.StudentSelectService">
//        <constructor-arg ref="studentDao"/>
//    </bean>
//
//    <bean id="studentDelete" class="le12.StudentDeleteService">
//        <constructor-arg ref="studentDao"/>
//    </bean>
//
//    <bean id="studentAllSelect" class="le12.StudentAllSelectService">
//        <constructor-arg ref="studentDao"/>
//    </bean>
//
//    <bean id="studentModify" class="le12.StudentModifyService">
//        <constructor-arg ref="studentDao"/>
//    </bean>*/
//	@Bean
//	public StudentSelectService studentSelect(){
//		return new StudentSelectService(studentDao());
//	}
//
//	@Bean
//	public StudentModifyService studentModify(){
//		return new StudentModifyService(studentDao());
//	}
//
//	@Bean
//	public StudentDeleteService studentDelete(){
//		return new StudentDeleteService(studentDao());
//	}
//
//	@Bean
//	public StudentAllSelectService studentAllSelect(){
//		return new StudentAllSelectService(studentDao());
//	}
//
//	/*<bean id="teacherDao" class="le12.TeacherDao">
//        <property name="name" value="gildong"></property>
//        <property name="age" value="20"></property>
//        <property name="subject" value="programming"></property>
//        <property name="students">
//            <list>
//                <value>ggildong</value>
//                <value>gggildong</value>
//                <value>ggggildong</value>
//            </list>
//        </property>
//        <property name="email">
//            <map>
//                <entry>
//                    <key>
//                        <value>naver</value>
//                    </key>
//                    <value>teacher@naver.com</value>
//                </entry>
//            </map>
//        </property>
//    </bean>*/
//
//	@Bean
//	public TeacherDao teacherDao(){
//		TeacherDao teacherDao = new TeacherDao();
//		teacherDao.setName("gildong");
//		teacherDao.setAge(20);
//		teacherDao.setSubject("programming");
//
//		List list = new ArrayList();
//		list.add("ggildong");
//		list.add("gggildong");
//		list.add("ggggildong");
//		teacherDao.setStudents(list);
//
//		Map map = new HashMap();
//		map.put("naver", "teacher@naver.com");
//		teacherDao.setEmail(map);
//
//		return teacherDao;
//	}
//
//	@Bean
//	public Assembler assembler() {
//		return new Assembler(studentDao(), teacherDao());
//	}
//}
