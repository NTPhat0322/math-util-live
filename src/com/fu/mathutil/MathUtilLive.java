/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long rs = MathUtil.getFactorial(5);
        System.out.println("5! = " + rs);
        
        //thêm code sau lần đầu tiên dùng github - 10:30 AM October, 16th, 2024
        System.out.println("6! = " + MathUtil.getFactorial(6));
        System.out.println("7! = " + MathUtil.getFactorial(7));
    }
    
}
