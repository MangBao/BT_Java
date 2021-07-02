/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_strategy_pattern;

/**
 *
 * @author ASUS
 */
public class GiaoHangNhanh implements IDonViVanChuyen {

    @Override
    public float MucPhi() {
        return 20000;
    }

    @Override
    public int NgayGiao() {
        return 4;
    }

}
