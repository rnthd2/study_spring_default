package le12;

public class TeacherSelectService {
	TeacherDao teacherDao;

	//생성자를 통한 주입
	public TeacherSelectService(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
}
