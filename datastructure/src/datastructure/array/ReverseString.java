package datastructure.array;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "Hi there!";
		if(null != input && input.length()>1 && input instanceof String) {
			char[] output = new char[input.length()];
			for(int i=input.length()-1; i>=0; i--) {
				output[input.length()-(i+1)]=input.charAt(i);
			}
			System.out.println(output);
			System.out.println(String.valueOf(output));
		}
	}

}
