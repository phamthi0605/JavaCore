
public class Main {

	public static String reverseString(String str) {
		String revstr = "";
		char[] chr = str.toCharArray();
		for (int i = chr.length - 1; i >= 0; i--) {
			revstr += chr[i];
		}
		return revstr.toString();
	}

	public static void main(String[] args) {
		String givenStr = "PHAM THI THI";
		String revStr;
		revStr = reverseString(givenStr);
		System.out.println(revStr);
	}

}
