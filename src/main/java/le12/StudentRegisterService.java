package le12;

public class StudentRegisterService {

	StudentDao studentDao;

	//생성자를 통한 주입
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
