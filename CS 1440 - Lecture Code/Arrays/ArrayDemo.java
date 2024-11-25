public class ArrayDemo{

    public static void main(String[] args) {
        
        //String first = args[0]
        //String second = args[1];
        //System.out.println(first + " " + second);

        int[] numbers = new int[5]; //all initialized to 0 
        
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Sorting through Arrays
        int[] arr = {10, 35, 92, 40, 56, -5};

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        if (arr[0] > arr[4]){ //Can compare elements in an array
            System.out.println("First index > last");
        }

        //Enhanced for loop (For each loop)
        //Designed for arrays
        //Iterates over entire array once
        //Each iteration copies current element into loop variable (num)
        for(int num : arr){
            System.out.println(num);
        }

        //Usefull operations:
        //Sum of array
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("The sum of the array is " + sum);

        //Average of array
        double avg = (double)sum/arr.length;
        System.out.println("The avearage of the array is " + avg);


        int min = 100000;
        int max = -min;

        for(int num : arr){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }

        System.out.println("min: " + min + " max: " + max);


        //String arrays
        String[] names = {"JJ", "Jane", "Jim"};
        String[] strArr = new String[5]; //Each of the elements is set to null
 
        for (int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

        for (String s : strArr){
            System.out.println(s);
        }

        for (String s : names){
            System.out.println(s);
            System.out.printf("Lenghth: %d", s.length());
        }

        for (int i = 0; i < names.length; i++){
            System.out.println();
        }


        //Array of objects
        CircleArray[] circles = new CircleArray[3];
        for (int i = 0; i < circles.length; i++){
            circles[i] = new CircleArray(i + 1);
        }

        for (CircleArray c : circles){
            System.out.println(c.getRadius());
        }
    }
}