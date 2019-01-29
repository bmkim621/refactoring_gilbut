package refactoring_gilbut.chap04.before;

public class PersonBefore {
	private LabelBefore name;
	private LabelBefore mail;
	
	public PersonBefore(LabelBefore name, LabelBefore mail) {
		this.name = name;
		this.mail = mail;
	}

	public PersonBefore(LabelBefore name) {
		this(name, null);	//7번줄에 있는 생성자 호출됨.
	}

	public LabelBefore getName() {
		return name;
	}

	public LabelBefore getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return String.format("PersonBefore [name=%s, mail=%s]", name == null ? "\"(none)\"": name, mail == null ? "\"(none)\"": mail);
	}
	
	public void display() {
		if (name != null) {
			name.display();
		}
		
		if (mail != null) {
			mail.display();
		}
	}
	
	
}
