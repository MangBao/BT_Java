///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package bai2_ATM;
//
///**
// *
// * @author ASUS
// */
//public class menhGia {
//    public static ATM chonMenhGia(int loai){
//        ATM atm = new RutTien(500);
//        ATM menhGia100 = new RutTien(100);
//        ATM menhGia50 = new RutTien(50);
//        ATM menhGia10 = new RutTien(10);
//        ATM menhGia1 = new RutTien(1);
//
//        // nối chuỗi
//        atm.thietLapMenhGia(menhGia100)
//                .thietLapMenhGia(menhGia50)
//                .thietLapMenhGia(menhGia10)
//                .thietLapMenhGia(menhGia1);
//        switch (loai) {
//            case 500:
//                return atm;
//            case 100:
//                return menhGia100;
//            case 50:
//                return menhGia50;
//            case 10:
//                return menhGia10;
//            case 1:
//                return menhGia1;
//            default:
//                break;
//        }
//        return null;     
//        
//    }
//}
