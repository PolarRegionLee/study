public class Dog extends Animal {
    //1.因为Dog是Animal的子类
    //2.Dog的cry方法和Animal的cry方法 定义形式一样
    //3.Dog 的cry方法重写了Animal 的cry方法
    public void cry(){
        System.out.println("小狗汪汪..");
    }
}
