package le11;

import java.util.ArrayList;

public class MemberDao {

	private ArrayList<Member> member = new ArrayList<Member>();

	public void insert(Member m){
		member.add(m);
	}
}
