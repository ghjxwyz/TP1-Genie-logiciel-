public class TestMain {
	public static void main(String[] args) {
		System.out.println("=== Demo Git: run 1 ===");

		Test t = new Test("Bonjour");
		System.out.println("Initial: " + t);

		t.append(" monde");
		System.out.println("After append: " + t);

		System.out.println("Uppercase: " + t.toUpper());
		System.out.println("Length: " + t.length());

		t.setTexte("Edit me in a later commit");
		System.out.println("Reset: " + t);

		// Tip: change the string above, add a new print, commit, push
		System.out.println("=== End ===");
	}
}
