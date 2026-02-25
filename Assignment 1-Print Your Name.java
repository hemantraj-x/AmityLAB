//1. PRINT YOUR NAME-------------------------------
class PrintName {
String name; // member variable to store name
void display() { // member method to display name
System.out.println("My Name is: " + name);
}
public static void main(String[] args) {
PrintName obj = new PrintName(); // creating object
obj.name = "Abhishek Singh"; // assigning value to member variable
obj.display(); // calling member method
}
}
