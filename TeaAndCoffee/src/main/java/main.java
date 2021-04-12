/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        
    Coffee cf = new Coffee();
    Tea tea = new Tea();
    
    System.out.println("\nCach pha caffee");
    cf.prepareRecipe();
    
    System.out.println("\nCach pha tra");
    tea.prepareRecipe();
    
    
  }
}
