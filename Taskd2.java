public class Taskd2 {
    public static void main(String args[]) {
      System.out.println("Main method started");
      System.out.println(args);
      //display
        for (int index=0; index<args.length; index++) {
            System.out.println(args[index]);
        }

        //reverse the array element
        for (int index = args.length - 1; index > 0; index -- ){
            System.out.println(args[index]);
        }
    }
}   