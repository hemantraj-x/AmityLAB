class TemperatureConverter {
double celsius; // member variable to store celsius value
void convert() { // member method to convert temperature
double fahrenheit = (celsius * 9/5) + 32; // conversion formula
System.out.println("Temperature in Fahrenheit = " + fahrenheit);
}
public static void main(String[] args) {
TemperatureConverter obj = new TemperatureConverter(); // creating object
obj.celsius = 37; // assigning example temperature
obj.convert(); // calling conversion method
}
}
