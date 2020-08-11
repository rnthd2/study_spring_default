package le12;

public class StudentAllSelectService {
	StudentDao studentDao;

	//생성자를 통한 주입
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
