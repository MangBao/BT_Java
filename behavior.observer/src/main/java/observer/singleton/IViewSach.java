/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.singleton;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface IViewSach {
    public Sach themSach();
    public Sach capnhatSach();
    public Sach xoaSach();
    public void hienthiDS_Sach(ArrayList dsSach);
}
