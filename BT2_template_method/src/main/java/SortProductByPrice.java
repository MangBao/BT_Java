/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SortProductByPrice extends SortCollection<Product> {

    @Override
    protected int compare(Product t1, Product t2) {
//        if (t1.price > t2.price) {
//            return 1;
//        } else if (t1.price < t2.price) {
//            return -1;
//        }
//        return 0;
        return t1.price > t2.price ? 1 : (t1.price < t2.price ? -1 : 0);
    }

}
