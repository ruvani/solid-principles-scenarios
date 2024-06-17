
package com.solidprinciples.openclosed;

public class PaymentProcesser {

	public void processPayment(Payment payment) {
		
        if (payment instanceof CreditCardPayment) {
            
        	// process credit card payment
        	
        } else if (payment instanceof PayPalPayment) {
            
        	// process PayPal payment
        	
        }
        // more payment types 
    }
}


