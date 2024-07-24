/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializable_examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Serialization implements Serializable {

    int i = 10;
    int j = 20;
}

class Test {

    public static void main(String[] args) {
        Serialization a = new Serialization();
        a.i = 100;
        a.j = 200;
        
        try {
            File f = new File("A.ser");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
