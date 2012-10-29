public class Person {
	private String name;
	private int age;



	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
			for (int i = 0; i < words.length; i++) {
					if (words[i].equals("")==false) {
				String nextInitial = "" + words[i].charAt(0);	
				result = result + nextInitial.toUpperCase();
					}
			}
	return result;
	}



}




