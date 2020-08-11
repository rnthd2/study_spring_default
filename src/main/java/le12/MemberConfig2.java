package le12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//xml설정파일과 동일한 파일로 취급한다
@Configuration
//@ComponentScan(basePackageClasses = MemberConfig.class)
@ComponentScan("le12")
public class MemberConfig2 {

	@Autowired
	StudentDao studentDao;

	/*<bean id="studentRegister" class="le12.StudentRegisterService">
        <constructor-arg ref="studentDao"/>
    </bean>*/
	@Bean
	public StudentRegisterService studentRegister(){
		return new StudentRegisterService(studentDao);
	}

	/*<bean id="studentSelect" class="le12.StudentSelectService">
        <constructor-arg ref="studentDao"/>
    </bean>

    <bean id="studentDelete" class="le12.StudentDeleteService">
        <constructor-arg ref="studentDao"/>
    </bean>

    <bean id="studentAllSelect" class="le12.StudentAllSelectService">
        <constructor-arg ref="studentDao"/>
    </bean>

    <bean id="studentModify" class="le12.StudentModifyService">
        <constructor-arg ref="studentDao"/>
    </bean>*/
	@Bean
	public StudentSelectService studentSelect(){
		return new StudentSelectService(studentDao);
	}

	@Bean
	public StudentModifyService studentModify(){
		return new StudentModifyService(studentDao);
	}

	@Bean
	public StudentDeleteService studentDelete(){
		return new StudentDeleteService(studentDao);
	}

	@Bean
	public StudentAllSelectService studentAllSelect(){
		return new StudentAllSelectService(studentDao);
	}
}
