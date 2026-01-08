class jaggedArray {
    public static int[][] diffSizeArray (int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        return  nums;
    }

    public static void printArray(int[][] nums){
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }        
    }
}

class threeDArray {
    public static int[][][] threeDArr(int[][][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k =0;k<nums[i][j].length;k++){
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        return  nums;
    }
    public static void printArray(int[][][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k =0;k<nums[i][j].length;k++){
                    System.out.print(nums[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class Student{
    //instance variable case they are declared in a class not inside a method
    int rollno;
    String name;
    int marks;
}
public class Arrays {

    public static void main(String[] args) {
        // int nums[] = new int[4];
        // System.out.println(nums[1]);
        int[][][] nums = new int[3][4][5];

        Student s1 = new Student();
        s1.rollno = 21;
        s1.name = "Ananya";
        s1.marks = 77;

        Student s2 = new Student();
        s2.rollno = 22;
        s2.name = "Why";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 23;
        s3.name = "Me";
        s3.marks = 100;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int idx = 0; idx < students.length; idx++) {
        //     System.out.println(students[idx].name + " : " + students[idx].marks);
            
        // }

        //ENHANCED FOR LOOP
        for (Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
        // nums = jaggedArray.diffSizeArray(nums);
        // jaggedArray.printArray(nums);
        // nums = threeDArray.threeDArr(nums);
        // threeDArray.printArray(nums);


        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         nums[i][j] = (int) (Math.random() * 10);
        //     }
        // }


        // for (int[] n : nums) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
        /*for practice purpose only*/

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
