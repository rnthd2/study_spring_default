package le12;

import java.util.List;
import java.util.Map;

public class TeacherDao {
	String name;
	int age;
	String subject;
	List<String> students;
	Map<String, String> email;

	public TeacherDao() {
	}

	//setter를 이용한 의존 주입 방법
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public void setEmail(Map<String, String> email) {
		this.email = email;
	}
}
