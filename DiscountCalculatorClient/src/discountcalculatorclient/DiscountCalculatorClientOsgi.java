package discountcalculatorclient;



import java.util.*;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;

import discountcalculator.DiscountCalculatorInterface;

public class DiscountCalculatorClientOsgi {
			ComponentContext context;
			ServiceReference<?> reference;
			DiscountCalculatorInterface discountCalculator;
	
	  public void activate(ComponentContext context) {
	        
	        Scanner input=new Scanner(System.in);
	        System.out.println("----------------------------------------------");
	        System.out.println("Discount Calculator Osgi");
	        
	        System.out.println("Enter Initial Price: ");
	        double initialPrice=input.nextDouble();
	        
	        System.out.println("Enter Discount: eg:10% put in 10 ");
	        double discount=input.nextDouble();
	        
	       if(reference !=null) {
	    	   discountCalculator = (DiscountCalculatorInterface) context.
	    			   locateService("DiscountCalculatorInterface", reference);
	    	   
		        double finalPrice=discountCalculator.calculateDiscount(initialPrice, discount);
		        System.out.println("Final Price after discount: "+finalPrice);

	       }
	        
	        
	    }
	  
	  public void gotService(ServiceReference reference) {
			System.out.println("Bind Service");
			this.reference = reference;
		}

		public void lostService(ServiceReference reference) {
			System.out.println("unbind Service");
			this.reference = null;
		}

}
