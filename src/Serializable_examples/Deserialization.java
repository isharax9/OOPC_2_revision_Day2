/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializable_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author isharaLakshitha
 */
class Deserialization implements Serializable {

    int i  = 100;
    int j  = 200;
}

class Test {

    public static void main(String[] args) {
        try {
            File f = new File("A.ser");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Deserialization a = (Deserialization) ois.readObject();
            System.out.println(a.i);
            System.out.println(a.j);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
