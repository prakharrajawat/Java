public class sumUsingArray {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 3;
    arr[1] = 3;
    arr[2] = 3;
    arr[3] = 3;
    arr[4] = 4;
    int sum = 0;
    for (int i = 0; i <= 4; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Array Element ::" + sum);

  }
}
