package le12;

public class StudentSelectService {
	StudentDao studentDao;

	//생성자를 통한 주입
	public StudentSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
