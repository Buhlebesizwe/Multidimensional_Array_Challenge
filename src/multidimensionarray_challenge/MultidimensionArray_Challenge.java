package multidimensionarray_challenge;

public class MultidimensionArray_Challenge {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray[] = new int[100][30];

                int a = 0;
        while (a < myArray.length) {
            int b = 0;
            while (b < myArray[a].length) {
                myArray[a][b] = a + b;
                b++;
            }
            a++;
        }

        int z = 0;
        while (a < myArray.length) {
            int y = 0;
            while (y < myArray[z].length) {
                myArray[y][z] = y + z;
                y++;
            }
            z++;
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if ((myArray[i][j] % 2 != 0) || (myArray[i][j] % 8 == 0)) {
                    System.out.print(myArray[i][j] + ", ");
                } 
            }
            System.out.println("\n");
        }
    }
}
