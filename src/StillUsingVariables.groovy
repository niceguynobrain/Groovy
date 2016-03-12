/**
 * Created by Andrew Parker on 11/03/2016.
 *
 Write a program that stores your name and year of graduation into variables, and displays their values on the screen.

 Make sure that you use two variables, and that the variable that holds your name is the best type for such a variable,
 and that the variable that holds the year is the best type for that variable.

 Also make sure that your variable names are good: the name of a variable should always relate to its contents.

 */

/**
 * Creates series of out puts to the console which are useful for determining
 * what is generated by different code. The first three examples show passing
 * variables into a string from a constructor, then field data, them
 * properties, followed by static fields.
 *
 * This class calls the Me class for demonstration of passing variables and
 * method calls from interfaces and traits.
 *
 * @see URL http://programmingbydoing.com/a/using-variables.html
 *
 */
class StillUsingVariables {

    /** StillUsingVariables Constructor which takes a first and last name and
     * a data. It also prints a statement declaring the variables passed in.
     *
     * @param firstName         The first name of a person
     * @param lastName          The second name of a person
     * @param yearOfGraduation  The year of a persons graduation
     */
    StillUsingVariables(firstName, lastName, yearOfGraduation) {
        println "My name is $firstName $lastName and the year I graduated is $yearOfGraduation "
    }

    /**
     * StillUsingVariables Constructor which is empty.
     */
    StillUsingVariables() {
    }
    // Fields
    String firstName
    String lastName
    int yearOfGraduation

    /**
     * Displays the outcome in the terminal.
     * @param args  contains the supplied command-line arguments as an array of String objects.
     */
    static void main(def args) {

        // Using constructor
        def person = new StillUsingVariables("Andrew", "Parker", 2008)

        // Using empty constructor with map to fields
        person = new StillUsingVariables(firstName: "Andrew", lastName: "Parker",
                yearOfGraduation: 2008)

        println "My name is $person.firstName $person.lastName, the year I graduated is $person.yearOfGraduation."

        // Without constructor
        def name = "Andrew Parker"
        def year = "2008"

        def declaration = "My name is $name and the year I graduated is $year."
        println declaration

        assert declaration == "My name is Andrew Parker and the year I graduated is 2008."
        // Method speak called from class Me
        Me.speak()
        // a new instance of Me
        def ap = new Me()
        println ap.speaking("conversing")
        ap.eating("beans")
        assert ap.dateOfBirth == "5.12.84"
        assert ap.favColour == "blue"
        try {
            ap.favColour = "red"
        } catch (Exception shouldFail) {
            // auto-throw
        }
        ap.walking()
    }
}

/**
 * Creates methods and variables which print information about the class.
 *
 * The class implements the trait Statement for the purpose of demonstrating
 * the differences between a trait and an interface.
 *
 * @see URL http://docs.groovy-lang.org/latest/html/documentation/index.html#_traits
 */
class Me implements Statement {
    static String name = "Andrew Parker";
    static int year = 2016;
    /** Method speak is called in Class StillUsingVariables.
     *  Prints two statements.
     */
    static void speak() {
        println "My name is $name and the year is $year."
        println "My favourite colour is $favColour."
    }
    /** Method eating is called in Class StillUsingVariables.
     * Prints one statement.
     * @param food
     */
    @Override
    void eating(String food) {
        println "I am eating $food."
    }
    /** Method walking is called in Class StillUsingVariables.
     * Prints one statement.
     */
    @Override
    void walking() {
        println "I walk a lot."
    }
}
/** Interface which holds the value of favourite colour
 *
 */
interface FavouriteColour {
    static favColour = "blue"
}
/** Interface which implements the method eating which
 * takes as a parameter a String.
 */
interface Eating {
    void eating(String food)
}

/** Interface which implements the method walking
 *
 */
interface Exercise {
    void walking()
}
// a trait can have a method with a code block, an interface cannot.
/** Trait which implements the interfaces Eating, FavouriteColour and
 * Exercise. Also holds the static variable for date of birth and
 * implements the methods for speaking which takes a string, and
 * the method for running.
 */
trait Statement implements Eating, FavouriteColour, Exercise {
    static String dateOfBirth = "5.12.84"
    /** Method speaking is called in Class StillUsingVariables.
     * Prints one statement, and returns a String.
     * @param verb The doing word to express the type of speaking.
     * @return String A statement about what is being done.
     */
    String speaking(String verb) { "I am $verb." }
    // trait methods do not have to be implemented.
    /** Method running is not implemented.
     *
     * @return String A statement about running.
     */
    private String running() { "I am not running unless it's hot outside."}
}

