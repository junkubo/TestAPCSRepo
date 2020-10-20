class Demo {
  public static void printLoop(int n){
  for(int i = 0; i < n; i++){
    for(int j = 0;j < n; j++){
       System.out.println(i);
    }
  }
}
  public static void main(String[] args) {
    printLoop(3);
  }

}
