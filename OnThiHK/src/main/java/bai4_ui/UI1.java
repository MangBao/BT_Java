/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_ui;

/**
 *
 * @author ASUS
 */
public class UI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sử dụng Singleton
        DataAccess U1 = DataAccess.Instance();

        U1.add(new SanPham("SP01", "Cam", 3, 3000));
        U1.add(new SanPham("SP02", "Mận", 10, 5000));
        U1.add(new SanPham("SP03", "Chuối", 4, 2000));

        U1.printInfo();
        System.out.println("-----------------------------");
        //Tạo 1 sản phẩm mới
        SanPham sp_new1 = new SanPham("SP04", "Nho", 1500, 8000);
        //Thêm vao ds
        U1.add(sp_new1);
        //xóa 1 sản phầm(quan trong mã)
        U1.delete(new SanPham("SP03", "", 0, 0));
        U1.deleteByMaSP("SP01");
        //cap nhat sản phẩm
        U1.update(new SanPham("SP02", "Cam Mật", 10, 2000));
        
        System.out.println("Danh sách sau khi cập nhật.");
        U1.printInfo();
        
    }

}
