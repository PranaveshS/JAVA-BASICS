class multilevelinheritance {
  public static void main(String[] args) {
    C a=new C();
    a.add();
}
}
class A{
    static void add(){
    System.out.println("hello");
    }
} 
class B extends A{
  static void sub(){
    System.out.println("hello");
  }
}
class C extends B{
  static void mul(){
  System.out.println("welcome");
  }
}