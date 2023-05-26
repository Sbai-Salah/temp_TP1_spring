package com.sbai.salah.maven_spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	
	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Country countryConstructor = (Country) context.getBean("countryConstructor");
        Country countrySetter = (Country) context.getBean("countrySetter");
        Country countryFromFactory = (Country) context.getBean("countryFromFactory");


        System.out.println("Country (constructor): " + countryConstructor.getName() + ", Population: " + countryConstructor.getPopulation());
        System.out.println("Country (setter): " + countrySetter.getName() + ", Population: " + countrySetter.getPopulation());
        System.out.println("Country from factory: " + countryFromFactory.getName() + ", Population: " + countryFromFactory.getPopulation());

        ((ClassPathXmlApplicationContext) context).close();
		
    }

	
}
