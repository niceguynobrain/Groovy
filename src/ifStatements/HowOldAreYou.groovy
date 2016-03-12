package ifStatements

/**
 * Created by Andrew Parker on 12/03/2016.
 *
 */
/**
 *
 */
class HowOldAreYou implements AskingAndAnswering {
    /**
     *
     * @param args
     */
    static void main(args) {
        def name = AskName()
        def age = AskAge(name)
        if (age < 16)       result "You can't drive yet $name"
        if (age < 18)       result "You can't vote yet $name"
        if (age < 25)       result "You can't rent a car yet $name"
        else if (age > 25)  result "You can do anything that is legal $name"
        else                result "That's an unusual age $name!"
    }
    /**
     *
     */
    trait AskingAndAnswering {
        static def keyboard = new Scanner(System.in)
        static String AskName() {
            println "What is your name?"
            def name = keyboard.next()
        }
        static int AskAge(name) {
            println "\nOk, $name How old are you?"
            int age = keyboard.nextInt()
        }
        static void result(answer) {println "\n $answer"}
    }
}
