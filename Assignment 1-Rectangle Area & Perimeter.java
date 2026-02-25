class Rectangle {
double length, width; // member variables for rectangle dimensions
void calculate() { // member method for calculations
double area = length * width; // area formula
double perimeter = 2 * (length + width); // perimeter formula
System.out.println("Area = " + area); // printing area
System.out.println("Perimeter = " + perimeter); // printing perimeter
}
public static void main(String[] args) {
Rectangle obj = new Rectangle(); // creating object
obj.length = 10; // assigning length
obj.width = 5; // assigning width
obj.calculate(); // calling calculate method
}
}
