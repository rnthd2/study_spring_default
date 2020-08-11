package le12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//xml설정파일과 동일한 파일로 취급한다
@Configuration
@Import({MemberConfig2.class, MemberConfig3.class})
public class MemberConfig1 {

	//	<bean id="studentDao" class="le12.StudentDao"/>
	@Bean
	public StudentDao studentDao(){
		return new StudentDao();
	}

	@Bean
	public TeacherDao teacherDao() {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.setName("gildong");
		teacherDao.setAge(20);
		teacherDao.setSubject("programming");

		List list = new ArrayList();
		list.add("ggildong");
		list.add("gggildong");
		list.add("ggggildong");
		teacherDao.setStudents(list);

		Map map = new HashMap();
		map.put("naver", "teacher@naver.com");
		teacherDao.setEmail(map);

		return teacherDao;
	}
}
