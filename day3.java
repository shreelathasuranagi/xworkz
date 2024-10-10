public class day3 {
    public static void main(String[] args) {

        call(666104441); //invoking a method

        message("Hi How are you?", 5764756);

        int returnedValue = add(10,40);
        System.out.println(returnedValue); 

    } 

    public static int add(int... numbers){   //variable argument
        int addedValue = 0;
        for (int i = 0; i < numbers.length ; i++) {
            addedValue = addedValue + numbers[i];
        }
        return 0;
    }

    public static int add(int number1 , int number2) {
        int addedValue = number1 + number2;
        return addedValue;
    }

    public static void call(int mobile) {
        System.out.println("Calling " + mobile);
    }

    public static void call(String name) {
        System.out.println("Calling 2" + name);
    }
    
	public static void call(int mobileNumber, String name){
		System.out.println("Calling 2" + name);
	    }
    public static void message(String message, int mobileNumber){
        System.out.println(" Calling using message and mobile number");
        }
    public static void message(int mobileNumber, String message){
        System.out.println(" Calling using mobile number and message");
            }
    






}
