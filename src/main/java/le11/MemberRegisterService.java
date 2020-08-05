package le11;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService{
	@Autowired
	private MemberDao memberDao;

	public MemberRegisterService() {
	}

	public void register(Member member){
		memberDao.insert(member);
	}

	public void destroy() throws Exception {
		System.out.println("MemberRegisterService::bean 객체 소멸");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("MemberRegisterService::bean 객체 생성");
	}
}
