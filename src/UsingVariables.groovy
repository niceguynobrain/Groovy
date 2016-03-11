/**
 * Created by Andrew Parker on 11/03/2016.
 *
 *
 Write a program that creates three variables: an int, a double, and a String.

 Put the value 113 into the first variable, the value 2.71828 into the second,
 and the value "Computer Science" into the third. It does not matter what you
 call the variables... this time.

 Then, display the values of these three variables on the screen, one per line.
 */

/**
 * Creates an list of variables which are returned one per line.
 *
 * @see URL: http://programmingbydoing.com/a/using-variables.html
 */
class UsingVariables {

    /** Displays the variables defined, in the terminal.
     *
     * @param args contains the supplied command-line arguments as an array of String objects.
     */
    static void main(def args) {
     def variables = [ 113, 2.71828, "Computer Science"]
        variables.each {println it}
    }
}
