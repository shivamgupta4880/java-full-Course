package Arrayss;

import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();            // number of elements
    int max = Integer.MIN_VALUE;     // or read first element separately
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x > max) max = x;
    }
    System.out.println(max);
    sc.close();
  }
}

