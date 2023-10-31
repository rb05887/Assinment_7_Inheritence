package test;

class Staff {
	private String CodeName;

	public String getCodeName() {
		return CodeName;
	}

	public Staff(String cn) {
		this.CodeName = cn;
	}

	public String toString() {
		return String.format("%s ", this.CodeName);
	}
}

class Typist extends Staff {
	int speed;

	public int getSpeed() {
		return speed;
	}

	Typist(String cn, int speed) {
		super(cn);
		this.speed = speed;
	}

	public String toString() {
		return super.toString() + String.format("%d ", this.speed);
	}

}

class Regular extends Typist {
	int salary;

	public int getSalary() {
		return salary;
	}

	Regular(String cn, int speed, int salary) {
		super(cn, speed);
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + String.format("%d ", this.salary);
	}
}

class Casual extends Typist {
	int dailyWages;

	public int getDailyWages() {
		return dailyWages;
	}

	Casual(String cn, int speed, int dailyWages) {
		super(cn, speed);
		this.dailyWages = dailyWages;
	}

	public String toString() {
		return super.toString() + String.format("%d ", this.dailyWages);
	}
}

class Teacher extends Staff {
	String subject;

	public String getSubject() {
		return subject;
	}

	Teacher(String cn, String subject) {
		super(cn);
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + String.format("%s", this.subject);
	}
}

class Officer extends Staff {
	String grade;

	public String getGrade() {
		return grade;
	}

	Officer(String cn, String grade) {
		super(cn);
		this.grade = grade;
	}

	public String toString() {
		return super.toString() + String.format("%s", this.grade);
	}
}

public class Institute {
	public static void main(String[] args) {
		
	}
}
