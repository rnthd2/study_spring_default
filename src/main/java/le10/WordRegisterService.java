package le10;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class WordRegisterService {

	@Resource
	private WordDao wordDao;

	public WordRegisterService() {
	}

	@Autowired
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
}

