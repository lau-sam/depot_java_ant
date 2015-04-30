/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava.bdd;

import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Florian
 */
public class Reader {

    public static Iterable<Student> Read(String filePath) throws IOException {

        // open file stream
        FileReader reader = new FileReader(filePath);

        // Construct csv reader
        CSVReader<Student> csvPersonReader = new CSVReaderBuilder<Student>(reader).entryParser(new StudentEntryParser()).build();

        // Read data
        List<Student> students = csvPersonReader.readAll();
        return students;
    }
}
