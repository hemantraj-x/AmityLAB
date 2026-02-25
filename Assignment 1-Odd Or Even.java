class OddEven {
int number; // member variable to store number
void check() { // member method to check condition
if(number % 2 == 0) // checking divisibility by 2
System.out.println(number + " is Even");
else
System.out.println(number + " is Odd");
}
public static void main(String[] args) {
OddEven obj = new OddEven(); // creating object
obj.number = 7; // assigning value to number
obj.check(); // calling check method
}
}
