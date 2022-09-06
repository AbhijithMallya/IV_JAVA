import static java.lang.Math.pow;

import java.util.*;

public class prg11 {

  void subset(int num, int n, int x[]) {
    int i;
    for (i = 1; i <= n; i++) x[i] = 0;
    for (i = n; num != 0; i--) {
      x[i] = num % 2;
      num /= 2;
    }
  }

  public static void main(String args[]) {
    int a[] = new int[10];
    int x[] = new int[10];
    int n, d, sum, present = 0;
    int j;
    System.out.println("Enter the number of elements of set :: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    System.out.println("Enter the elements of set ");
    for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
    System.out.println("Enter the positive integer sum :: ");
    d = sc.nextInt();
    prg11 s = new prg11();
    if (d > 0) {
      for (int i = 1; i <= Math.pow(2, n) - 1; i++) {
        s.subset(i, n, x);
        sum = 0;
        for (j = 1; j <= n; j++) if (x[j] == 1) sum += a[j];
        if (d == sum) {
          System.out.println("Subset = { ");
          present = 1;
          for (j = 1; j <= n; j++) if (x[j] == 1) System.out.print(a[j] + " ");
          System.out.print("} = " + d);
          System.out.println();
        }
      }
    }
    if (present == 0) System.out.println("Solution does not exist");
    sc.close();
  }
}
