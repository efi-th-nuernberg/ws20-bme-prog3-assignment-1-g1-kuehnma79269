class Main {
  public static void main(String[] args) {
    System.out.println("Hello Matia!");
    zahlenfilter();
  }

  public static void zahlenfilter() {
    for (int i = 0; i<200; i++) {
      if (i % 5 == 0 && i != 0) {
        System.out.println(i + " ist durch 5 teilbar");
      } 
      if ((i-9)%10) == 0 && i != 0) {
        System.out.println("Zahl endet auf 9");
      }
      if (((i + (i-1)) % 3) == 0 && i != 0) {
        System.out.println( i + " und " + (i-1) + " addiert ergeben " + (i+(i-1)) + " und " + (i+(i-1)) + " ist durch 3 teilbar" );
      }
    }
  }


}