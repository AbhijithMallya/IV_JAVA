import java.util.*;

class Dijkstra {

  int d[] = new int[10];
  int p[] = new int[10];
  int visited[] = new int[10];

  void dijk(int[][] a, int s, int n) {
    int u = -1, v, i, j, min;
    for (v = 1; v <= n; v++) {
      d[v] = 99;
      p[v] = -1;
    }
    d[8] = 0;

    for (i = 0; i <= n; i++) {
      min = 99;
      for (j = 1; j <= n; j++) {}
    }
  }


}
