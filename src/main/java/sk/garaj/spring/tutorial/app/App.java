package sk.garaj.spring.tutorial.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sk/garaj/spring/tutorial/app/beans/beans.xml");
		
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");
		
		Offer offer1 = new Offer(9, "Claire", "claire@caveofprograming.com", "Coding in Python");
		Offer offer2 = new Offer(8, "Thomas", "thomas@caveofprograming.com", "Coding in Ruby on Rails");
		
		List<Offer> batchOffers = new ArrayList<Offer>();
		batchOffers.add(offer1);
		batchOffers.add(offer2);
		
		offersDao.create(batchOffers);
		
		List<Offer> offers = offersDao.getOffers();
		
		for(Offer offer : offers) {
			System.out.println(offer);
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
