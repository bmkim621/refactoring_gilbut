package refactoring_gilbut.chap04.after;

public class PersonAfter {
	private LabelAfter name;
	private LabelAfter mail;
	
	public PersonAfter(LabelAfter name, LabelAfter mail) {
		this.name = name;
		this.mail = mail;
	}

	public PersonAfter(LabelAfter name) {
		this(name, LabelAfter.newNull());	//7번줄에 있는 생성자 호출됨.
	}

	public LabelAfter getName() {
		return name;
	}

	public LabelAfter getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return String.format("PersonBefore [name=%s, mail=%s]", name, mail);
	}
	
	public void display() {
			name.display();
			mail.display();
	
	}
	
	
}
