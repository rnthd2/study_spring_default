package le10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WordRegisterService {

//	@Autowired(required = false)
//	@Qualifier("usedDao")
	private WordDao wordDao;

	public WordRegisterService() {

	}

	public WordRegisterService(WordDao wordDao){
		this.wordDao = wordDao;
	}
}

