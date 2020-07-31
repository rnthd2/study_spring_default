package le07;

public class Assembler {

	public Assembler(StudentDao studentDao, TeacherDao teacherDao) {
		StudentSelectService studentSelectService = new StudentSelectService(studentDao);
		TeacherSelectService teacherSelectService = new TeacherSelectService(teacherDao);
	}
}
