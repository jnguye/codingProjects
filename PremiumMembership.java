/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorestart;

/**
 *
 * @author Jonathan Nguyen
 */
public class PremiumMembership extends Membership {

   
/**
 * 
 * @param name
 * @param paymentMethod 
 */
    public PremiumMembership(String name, String paymentMethod) {
        super(name, paymentMethod);
        this.totalSpent = 20;
        
    }

}
