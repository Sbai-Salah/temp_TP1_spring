package com.sbai.salah.maven_spring;
import org.apache.commons.lang3.StringUtils;

public class App 
{
	
	    public int sum(int a, int b) {
	        return a + b;
	    }
	    
	    public static void main(String[] args) {

	        String text = "Hello, World! salahooo";
	        
	        // Vérifier si une chaîne est vide ou null
	        boolean isEmpty = StringUtils.isEmpty(text);
	        System.out.println("Is Empty: " + isEmpty);
	        
	        // Inverser une chaîne
	        String reversed = StringUtils.reverse(text);
	        System.out.println("Reversed Text: " + reversed);
	        
	        // Compter le nombre d'occurrences d'une sous-chaîne
	        int count = StringUtils.countMatches(text, "o");
	        System.out.println("Count of 'o': " + count);
	    }
	
}
