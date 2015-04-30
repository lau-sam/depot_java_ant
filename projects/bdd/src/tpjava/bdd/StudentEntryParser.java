/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava.bdd;

import com.googlecode.jcsv.reader.CSVEntryParser;

/**
 *
 * @author Florian
 */
public class StudentEntryParser implements CSVEntryParser<Student> {

    @Override
    public Student parseEntry(String... data) {
        int id = Integer.parseInt(data[0]);
        String firstname = data[1];
        String lastname = data[2];

        return new Student(id, firstname, lastname);
    }
}
