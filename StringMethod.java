package core.java;

public class StringMethod {

	public static void main(String[] args) {
		String names[] = { "ahasan", "atif", "sumon", "rumon" };

		for (String name : names) {
			if (name.startsWith("a"))
				System.out.println("Start with name: " + name);

			if (name.endsWith("on"))
				System.out.println("End with name: " + name);

			if (name.matches("ahasan"))
				System.out.println("Match with char: " + name);
			
			if (name.contains("i"))
				System.out.println("Contains with char: " + name);
			
		}
	}

}
