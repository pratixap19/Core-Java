package stringConcepts;

public class String_Intro {

	public static void main(String[] args) {
		
    char arr[] = {'p', 'y', 't', 'h', 'o', 'n'};
    
    String s1 = new String(arr);//String is called array of characters
    System.out.println(s1);
    
    //String is a class
    String s2 = new String();
    
    //String is immutable object
    String s3= "Selenium";
    
    //There are multiple ways to create String objects. String, StringBuffer, StringBuilder
    
    String s4 = "Hello";
    String s5 = new String();
    StringBuffer s6 = new StringBuffer();
    StringBuilder s7 = new StringBuilder();
	}

}
