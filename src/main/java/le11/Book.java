package le11;

public class Book {
	private String title;
	private Member member;

	public Book(String title, Member member) {
		this.title = title;
		this.member = member;
	}

	public String getTitle() {
		return title;
	}

	public Member getMember() {
		return member;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
