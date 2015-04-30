/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava.bdd;

/**
 *
 * @author Florian
 */
public class Student {

    private int _id;
    private String _firstName;
    private String _lastName;

    public Student(int id, String firstName, String LastName) {
        _id = id;
        _firstName = firstName;
        _lastName = LastName;
    }

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @return the _firstName
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName() {
        return _lastName;
    }
}
