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
public class KimCuong extends DsHangHoa {

    @Override
    public double tinhChietKhau() {
//        if(tinhTien() > 1500000)
//            return tinhTien() * 0.06;
//        else if(tinhTien() > 1000000)
//            return tinhTien() * 0.05;
//        else if(tinhTien() > 500000)
//            return tinhTien() * 0.03;
//        else
//            return 0;

        return (tinhTien() > 1500000) ? tinhTien() * 0.06 : ((tinhTien() > 1000000) ? tinhTien() * 0.05 : ((tinhTien() > 500000) ? tinhTien() * 0.03 : 0));
    }

}
