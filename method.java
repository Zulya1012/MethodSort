public class method {
  public static void main(String[] arg) {
    int[] num = {
      3,
      5,
      8,
      9,
      6,
      6,
      2
    };
    int[] newnum = {
      8,
      5,
      2,
      1,
      6,
      2,
      2
    };

    sortonly(num);
    System.out.println();

    findduplicates(newnum);

  }

  static void sortonly(int[] num) {
    int count = 1;
    for (int i = 0; i < num.length; i++) {
      for (int j = 1; j < num.length; j++) {
        if (num[j - 1] > num[j]) {
          int min = num[j];
          num[j] = num[j - 1];
          num[j - 1] = min;

        }

      }
    }
    for (int l: num) {
      System.out.println(l);
    }
  }
  static void findduplicates(int[] num) {

    int count = 1;
    for (int i = 0; i < num.length; i++) {
      for (int j = 1; j < num.length; j++) {
        if (num[j - 1] > num[j]) {
          int min = num[j];
          num[j] = num[j - 1];
          num[j - 1] = min;

        }

      }
    }
    for (int k = 1; k < num.length; k++) {
      if (num[k] == num[k - 1]) {
        count = count + 1;
      } else {
        System.out.println(num[k - 1]);
        System.out.println(count);
        count = 1;
      }
    }
    System.out.println(num[num.length - 1]);
    System.out.println(count);
  }

}
