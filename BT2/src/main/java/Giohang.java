
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties .
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Giohang {

    IThanhtoan hinhThucTT;
    List<HangHoa> gioHang = new ArrayList<>();

    public double thanhtoan() {
        int tienHang = 0;

        tienHang = gioHang.stream().map(hanghoa -> hanghoa.gia).reduce(tienHang, (sum1, sum2) -> sum1 + sum2);
        
        return hinhThucTT.thanhtoan(tienHang);
    }

    public void setHinhThucTT(IThanhtoan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

}
