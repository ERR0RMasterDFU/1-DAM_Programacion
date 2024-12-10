package stringBuilder;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder ();
		
		sb.append("IniFin");
		
		System.out.println("\n"+sb);
		
		sb.insert(3, 12345);
		
		System.out.println("\n"+sb);
		
		sb.replace(3, 8, "Mitad");
		
		System.out.println("\n"+sb);
		
		System.out.println("\n"+sb.substring(3, 8));
		
	}

}
