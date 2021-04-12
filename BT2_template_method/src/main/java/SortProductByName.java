/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SortProductByName extends SortCollection<Product> {

    @Override
    protected int compare(Product t1, Product t2) {
        return t1.name.compareTo(t2.name) > 0 ? 1 : (t1.name.compareTo(t2.name) == 0 ? 0 : -1);
    }

}
