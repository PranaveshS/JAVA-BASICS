class heirarchical {
public static void main(String[] args) {
      C a=new C();
            B b=new B();
            System.out.println(+b.d);
      System.out.println(+a.e);
}
}
class A {
      int a=10,b=20;
} 
class B extends A {
      int d=a-b;
      void sub() {
            System.out.println(d);
      }
}
class C extends A {
      int e=a+b;
void add(){
      System.out.println(e);
}
}