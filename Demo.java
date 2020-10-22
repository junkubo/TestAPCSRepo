import java.util.Arrays;
import java.util.Random;


class Demo {
  public static void printLoop(int n){
  for(int i = 0; i < n; i++){
    for(int j = 0;j < n; j++){
       System.out.println(i);
    }
  }
}
  public static  String arrToString(int[] arr){
    String dict = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length-1) {
        dict += arr[i];
      } else {
        dict += arr[i] + ", ";
      }
    }
    dict += "}";
    return dict;
  }

 

  public static String arrayDeepToString(int[][] arr) {
    String arrStr = "{";
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (j == 0) {
          arrStr += "{";
        }
        if (j == arr[i].length-1) {
          arrStr += arr[i][j];
        } else {
          arrStr += arr[i][j] + ", ";
        }
    }
    if (i == arr.length - 1) {
      arrStr += "}";
    } else {
      arrStr += "},";
    }
  }
    arrStr += "}";
    return arrStr;
  }

  public static int[][] create2DArray(int a, int b, int c) {
    Random rand = new Random();
    int[][] arr = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        arr[i][j] = rand.nextInt(c+1);
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    Random rand = new Random();

    return create2DArray(rand.nextInt(rows+1), rand.nextInt(cols+1), rand.nextInt(maxValue+1));
  }

  public static void main(String[] args) {
  
    int[][] arr = {{1,2,3,4}, {3,4,5,6}};

    System.out.println(arrayDeepToString(arr));
    System.out.println(arrayDeepToString(arr).replace("},","},\n"));
    System.out.println(arrayDeepToString(create2DArray(5,4,4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(7,5,10)));
  }

}


