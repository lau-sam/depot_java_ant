/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tpjava.bdd.Student;
import tpjava.bdd.Reader;

/**
 *
 * @author Florian
 */
public class DataAccessorService {

    public static List<String> Read(String filePath) throws IOException {
        List<String> results = new ArrayList<>();
        for (Student student : Reader.Read(filePath)) {
            String value = "[" + student.getId() + "] " + student.getFirstName() + " - " + student.getLastName();
            results.add(value);
        }
        return results;

    }
}
