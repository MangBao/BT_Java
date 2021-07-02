/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNV;


/**
 *
 * @author ASUS
 */
public class NhanVien implements NguoiQuanLy.NguoiQuanLyObserver{
    NguoiQuanLy nql;
    String tenNV, congViec, motaCongViec, ngayKetThuc;

    public String getTenNV() {
        return tenNV;
    }
    
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setNql(NguoiQuanLy nql) {
        this.nql = nql;
    }

    public NhanVien(String tenNV, NguoiQuanLy nql) {
        this.tenNV = tenNV;
        this.nql = nql;
        this.nql.dangKy(this);
        this.congViec = this.nql.tenCV;//khi nào đk thì lấy luôn gt ban đầu
        this.motaCongViec = this.nql.motaCV;
        this.ngayKetThuc = this.nql.ngayKT;
        
        
    }
    
    @Override
    public void giaoCongViec(String congviecMoi, String motaMoi, String ngayKTMoi) {
        if (congviecMoi != null && motaMoi != null && ngayKTMoi != null) {
            congviecMoi = nql.tenCV;
            motaMoi = nql.motaCV;
            ngayKTMoi = nql.ngayKT;
        }
        System.out.println("Nhan vien "+ tenNV + " " +"da nhan cong viec " + congviecMoi + "."
                + "\n" + "La cong viec: " + motaMoi + "." + "\n" + "Ngay ket thuc: " + ngayKTMoi);
        this.congViec = congviecMoi;
        this.motaCongViec = motaMoi;
        this.ngayKetThuc = ngayKTMoi;
    }

}
