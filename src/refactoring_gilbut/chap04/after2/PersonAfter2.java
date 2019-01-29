package refactoring_gilbut.chap04.after2;

public class PersonAfter2 {
	private LabelAfter2 name;
	private LabelAfter2 mail;
	
	public PersonAfter2(LabelAfter2 name, LabelAfter2 mail) {
		this.name = name;
		this.mail = mail;
	}

	public PersonAfter2(LabelAfter2 name) {
		this(name, LabelAfter2.newNull());	//7번줄에 있는 생성자 호출됨.
	}

	public LabelAfter2 getName() {
		return name;
	}

	public LabelAfter2 getMail() {
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
