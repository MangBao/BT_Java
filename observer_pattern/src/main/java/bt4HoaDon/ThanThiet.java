/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4HoaDon;
/**
 *
 * @author ASUS
 */
public class ThanThiet extends DsHangHoa {

    @Override
    public double tinhChietKhau() {
//        if(tinhTien() >= 500000)
//            return tinhTien() * 0.02;
//        else
//            return 0;
        return (tinhTien() >= 500000) ? tinhTien() * 0.02 : 0;
    }

}
