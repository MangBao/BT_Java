/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_decorator.beverage;

/**
 *
 * @author ASUS
 */
public class DarkRoast extends Beverage{
    
    //pt khoi tao mac dinh Beverage khong the ke thua vi bi ghi de nen phai khoi tao pt moi cua lop con

    public DarkRoast(String desciption) {
        super(desciption);
    }

    @Override
    public int cost() {
        return 10;
    }
    
}
