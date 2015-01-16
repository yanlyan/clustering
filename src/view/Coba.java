/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Random;

/**
 *
 * @author yanlyan
 */
public class Coba {
    public static void main(String[] args) {
        Random generator = new Random();
        int i = generator.nextInt(10) + 1;
        System.out.println(i);
    }
}
