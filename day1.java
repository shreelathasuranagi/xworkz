public class day1{

    public static void main(String[] args){
        int[] marks = {10,20,30};
        char[] grades = {'A' , 'B', 'C'};
        float[] height = {36.7f , 23.5f ,90.2f};

        System.out.println(marks[1]);
        System.out.println(grades[2]);
        grades[2] = 'H';
        System.out.println(grades[2]);
        System.out.println(height[0]);
    }
}