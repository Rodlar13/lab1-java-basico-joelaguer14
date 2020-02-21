package cr.una.lab1;

/**
 * Student Class
 */
public class Student {

    private String name;
    private String lastName;

    /**
     *
     * @param name
     * @param lastName
     */
    Student(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }
}
