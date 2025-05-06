public class Person {

    //instance v
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0; //default 0
    private Person[] siblings = new Person[0]; //default

    /**
     * constructs a new Person object with the given information
     * the number of siblings is initialized to 0 and the siblings array is empty by default
     *
     * @param firstname first name of the person
     * @param lastname last name of the person
     * @param birthDay day of birth (e.g. 15).
     * @param birthMonth month of birth (e.g. 7 for July).
     * @param birthYear year of birth (e.g. 1990).
     * @param ssn social security number of the person
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        //numberOfSiblings and siblings are initialized from instance variable declare
    }

    //methods

    /**
     * gets the first name of the person
     * @return first name
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * gets the last name of the person.
     * @return last name
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * sets the first name of the person
     * @param firstname the new first name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * sets the last name of the person
     * @param lastname the new last name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * gets the person's birthday in "d/m/y" format
     * @return a String representing the birthday in d/m/y format
     */
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * adds a given Person object to this person's list of siblings
     * a new, larger array is created, elements from the old array are copied over,
     * and the new sibling is added. The siblings instance variable is updated
     * to reference the new array, and the sibling count goes up by 1.
     *
     * @param sibling the Person object to add as a sibling
     */
    public void addSibling(Person sibling) {
        //make new array that is one element larger than the current siblings array
        Person[] newSiblings = new Person[this.numberOfSiblings + 1];

        //copy elements from the old siblings array to the new array
        //loop through the existing elements
        for (int i = 0; i < this.numberOfSiblings; i++) {
            newSiblings[i] = this.siblings[i];
        }

        //add the new sibling to the last position of the new array
        //the last position is at the index equal to the original numberOfSiblings
        newSiblings[this.numberOfSiblings] = sibling;

        //update the instance variable to reference the new array
        this.siblings = newSiblings;

        //increment the count of siblings
        this.numberOfSiblings++;
    }

    /**
     * gets the array of Person objects who are siblings of this person
     *
     * @return an array of Person objects representing the siblings
     */
    public Person[] getSiblings() {
        return this.siblings;
    }

}