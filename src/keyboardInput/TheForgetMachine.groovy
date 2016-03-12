package keyboardInput

/**
 * Created by Andrew Parker on 11/03/2016.
 *
 * Ask the user for two words and two numbers, and let the person at the keyboard type in some values,
 * but don't bother storing their responses into any variables.
 */

/** Creates scanner which reads the answers given for a users age, height and weight.
 *
 */
class TheForgetMachine {
    /**
     * Displays questions to a user. The scanner reads the reponses and then prints
     * a statement giving the information back to the user.
     *
     * @param args contains the supplied command-line arguments as an array of String objects.
     */
        static main(def args) {
            // Unknown if there is a more Groovy way to do this.
            Scanner keyboard = new Scanner(System.in)

            try {
                println "How old are you? "
                int age = keyboard.nextInt()
                println "How tall are you? "
                String height = keyboard.next()
                println "How much do you weight? "
                double weight = keyboard.nextDouble()
                println "So you're $age years old, $height feet tall and $weight kilograms."
            } catch (InputMismatchException e) {
                println "You need to enter a number for age and weight"
            }

            keyboard.close()
        }
}
