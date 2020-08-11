package le12;

public class StudentModifyService {
	StudentDao studentDao;

	//생성자를 통한 주입
	public StudentModifyService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
