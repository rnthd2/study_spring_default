package le11;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class BookRegisterService implements InitializingBean , DisposableBean{
	@Autowired
	private  BookDao bookDao;

	public BookRegisterService() {
	}

	public void register(Book book){
		bookDao.insert(book);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("BookRegisterService::bean 객체 생성");
	}

	public void destroy() throws Exception {
		System.out.println("BookRegisterService::bean 객체 소멸");
	}
}
