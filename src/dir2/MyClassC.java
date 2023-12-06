package mypackage.dir2;

public class C
{
  public C() {}

  public void func1(C arg1)
  {
    arg1.func2();
  }

  private void func2()
  {
    C var1 = new C();
    var1.func3();
    func3();
  }

  private void func3() {}

  private void func4() {}
}
