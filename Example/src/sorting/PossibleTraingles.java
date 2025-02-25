package sorting;

import java.util.Arrays;

public class PossibleTraingles {
    public static void main(String[] args) {
        int[] input1 = new int[]{4, 6, 3, 7};
        int[] input2 = new int[]{6, 4, 9, 7, 8};
        System.out.println(findNumberOfTriangles1(input2, 5));
    }

    //Function to count the number of possible triangles.
    static int findNumberOfTriangles1(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] > arr[k] &&
                            arr[j] + arr[k] > arr[i] &&
                            arr[k] + arr[i] > arr[j])
                        count++;
                }
            }
        }
        return count;
    }

    static int findNumberOfTriangles(int arr[], int n)
    {
        // Count of triangles
        int count = 0;

        // The three loops select three different values from
        // array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // The innermost loop checks for the triangle
                // property
                for (int k = j + 1; k < n; k++)

                    // Sum of two sides is greater than the
                    // third
                    if (arr[i] + arr[j] > arr[k]
                            && arr[i] + arr[k] > arr[j]
                            && arr[k] + arr[j] > arr[i])
                        count++;
            }
        }
        return count;
    }
}
