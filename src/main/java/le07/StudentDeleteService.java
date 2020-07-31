package le07;

public class StudentDeleteService {
	StudentDao studentDao;

	//생성자를 통한 주입
	public StudentDeleteService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
