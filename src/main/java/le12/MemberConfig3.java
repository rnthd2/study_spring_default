package le12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//xml설정파일과 동일한 파일로 취급한다
@Configuration
@ComponentScan("le12")
public class MemberConfig3 {

	@Autowired
	StudentDao studentDao;

	@Autowired
	TeacherDao teacherDao;

	@Bean
	public Assembler assembler() {
		return new Assembler(studentDao, teacherDao);
	}
}
