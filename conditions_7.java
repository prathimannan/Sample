package conditions;

public class conditions_7 {
	public static void main(String[] args) {
		int age = 18;
		if (age<10 && age>=0) {
			System.out.println("kid");
		} else if (age <25  && age >=18) {
			System.out.print("adult");
		} else if (age < 30 && age >= 50) {
			System.out.print("men");
		}	else {
			System.out.println("invalid");
		}
	}
}
