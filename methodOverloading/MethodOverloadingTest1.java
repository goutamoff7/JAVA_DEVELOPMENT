package methodOverloading;
class Test1
{

public void m1(int i)
{

System.out.println("int arg method");

}

public void m1(float d)
{

System.out.println("float arg method");

}
}
class MethodOverloadingTest1{

public static void main(String[] args) {

Test1 t = new Test1();

t.m1(10);//int arg method

t.m1(10l);//float arg method

//t.m1(10.5);//CE

}

}

