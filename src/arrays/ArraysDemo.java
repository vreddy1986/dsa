package arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //Array Creation : Using the keyword new
        int[] myArray1 = new int[7];
        System.out.println(myArray1[1]);
        myArray1[1]=1;

        //Declaration & Initialization in the same step
        int[] myArray2 = new int[]{1,2,3,4};
        System.out.println(myArray2[1]);

        //Array Initializer
        int[] myArray3 = {1,2,3,4,5,6,7}; // no array size in between the []
        System.out.println(myArray3[4]);

        //2D Array
        int[][] myArray ={{2,8,1,6}, {1,6,5,3}};
        System.out.println("2D array length:"+ myArray.length);

        //Printing using indexes
        System.out.println("\n");
        for(int i=0 ; i<myArray.length ; i++){
            for(int j=0; j<myArray[i].length; j++){
                System.out.println("Element at row["+ i + "], & column ["+ j +"]:" + myArray[i][j]);
            }
        }

        //Printing using enhanced for loop
        System.out.println("\n");
        for(int[] innerArray: myArray){
            for(int element: innerArray){
                System.out.print(element + "\t");
            }
            System.out.println("");
        }

        //3D Array
        int[][][] my3DArray ={{{2,8,1,6}, {1,6,5,3}, {3,2,6,4}}, {{20,80,10,60}, {10,60,50,30}, {30,20,60,40}}};
        System.out.println("3D Array Length is:" + my3DArray.length +"\n");

        //printing using indexes
        for(int i=0; i<my3DArray.length; i++){
            System.out.println("\nArray:"+i);
            for(int j=0; j<my3DArray[i].length; j++){
                System.out.println("Row:"+j);
                for(int k=0; k<my3DArray[i][j].length; k++){
                    System.out.println("Element in array:" + i + ", row:" +j+ ", column:" +k+ ", is:"+my3DArray[i][j][k]);
                }
            }
        }

        //printing using enhanced for loop
        System.out.println("\n\n");
        for(int[][] inner2DArray : my3DArray){
            for(int[] innerArray : inner2DArray){
                for(int element : innerArray){
                    System.out.print(element + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
