class AddNumbers {
int a, b; // member variables to store numbers
void add() { // member method to perform addition
int sum = a + b; // performing addition
System.out.println("Sum = " + sum); // printing the result
}
public static void main(String[] args) {
AddNumbers obj = new AddNumbers(); // creating object
obj.a = 10; // assigning value to a
obj.b = 20; // assigning value to b
obj.add(); // calling add method
}
}
