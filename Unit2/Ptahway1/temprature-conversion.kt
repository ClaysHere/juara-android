// My Solution

fun main() {
    val celsiusToFahrenheit: (Double) -> Double = { celsius ->
    celsius * (9/5) + 32
}
    
    val kelvinToCelsius: (Double) -> Double = { kelvin ->
    kelvin - 273.15
}
    
    val fahrenheitToKelvin: (Double) -> Double = { fahrenheit -> 
    (((fahrenheit-32)*5)/9)+273.15
    }
    
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit )
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius )
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin )
}



fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}


// Solution

fun main() {    
        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
        printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
        printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
