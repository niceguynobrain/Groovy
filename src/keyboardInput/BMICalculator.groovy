package keyboardInput

/**
 * Created by Andrew Parker on 12/03/2016.
 *
 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.
 * It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
 */
class BMICalculator {
    static void main(def args) {
        double heightInMeters
        double weightInKg
        double heightInInches
        double weightInPounds
        double feet
        double inches
        String weight = "your weight in "
        String height = "your height in "
        String bmi = "your BMI is "

        Scanner info = new Scanner(System.in)

        print height + " meters "
        heightInMeters = info.nextDouble()
        print weight + " kg "
        weightInKg = info.nextDouble()

        double bmiResult = weightInKg / (heightInMeters * heightInMeters)
        println bmi + bmiResult

        print height + " inches "
        heightInInches = info.nextDouble()
        print "$weight pounds "
        weightInPounds = info.nextDouble()
        println()

        heightInMeters = heightInInches * 0.0254
        weightInKg = weightInPounds * 0.453592

        bmiResult = weightInKg / (heightInMeters * heightInMeters)
        println("$bmi $bmiResult ")

        print("$height (feet only) ")
        feet = info.nextDouble()
        print("$height (extra inches) ")
        inches = info.nextDouble()
        print("$weight pounds ")
        weightInPounds = info.nextDouble()
        println()

        weightInKg = weightInPounds * 0.453592
        double heightInFeet = ((feet * 12) + inches) /12
        heightInMeters = heightInFeet * 0.3048

        bmiResult = weightInKg / (heightInMeters * heightInMeters)
        println("$bmi $bmiResult \n")

        info.close()
    }

}

