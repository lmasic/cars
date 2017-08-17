/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author virtuoso
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Serialization {
private static String fname;

    void write(Object obj) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fname))) {
            out.writeObject(obj);
        }
    }
}
