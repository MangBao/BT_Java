
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class TemplateMain {

    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        list.add(new Product("Cam", 20, 10));
        list.add(new Product("Quyt", 29, 100));
        list.add(new Product("Le", 45, 15));
        list.add(new Product("Buoi", 100, 2));

        SortCollection sortPrice = new SortProductByPrice();
        sortPrice.sort(list);
        System.out.println("Sap xep theo gia: ");
        list.forEach((item) -> {
            System.out.println(item.name + "\t" + item.price + "\t" + item.quality);
        });

        SortCollection sortName = new SortProductByName();
        sortName.sort(list);
        System.out.println("Sap xep theo ten: ");
        list.forEach((item) -> {
            System.out.println(item.name + "\t" + item.price + "\t" + item.quality);
        });
    }
}
