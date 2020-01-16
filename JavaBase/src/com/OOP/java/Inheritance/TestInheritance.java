package com.OOP.java.Inheritance;

/**
 * @author sunjiacheng
 * @create 2019-10-10-10:35
 */

/**
 * 面向对象的三大特性：之二：继承性
 * 1、为什么设计继承性
 * 2、通过 class A extentS B 来实现类的继承
 * 3、子类继承父类以后，父类中声明的属性、方法、子类都可以获取的到（构造器获取不到）
 *      （1）当父类中有私有的属性或者方法时，子类同样可以得到，只是由于封装性的设计，是的子类不能直接调用
 *      （2）子类除了通过继承获取父类的结构之外，还能定义自己特有的结构
 *      （3）extents 子类是对父类功能的拓展，而不是父类的子集
 * 4、java继承只支持单继承
 *      （1）一个子类只能继承一个父类
 *      （2）一个父类可以拥有多个子类
 *
 * 5、方法的重写
 *      （1）前提：子类继承父类
 *      （2）子类继承父类之后，若父类的方法对子类不适用，那么子类可以对父类的方法进行重写（覆盖）
 *      （3）要求子类方法的 返回值类型 方法名 （参数列表） 与父类的方法一样
 *      （4）要求子类方法的权限修饰符，不能小于父类方法的权限修饰符
 *      （5）如果父类方法抛异常，那么子类方法抛的异常类型，不能大于父类的
 *      （6）子类方法和父类方法必须同为 static 或者 同为 非static
 *      （7）特殊情况：
 *              如果父类的方法是 private 私有权限的，则子类重写该方法时，不认为是重写（权限，写法可随意写）
 *
 * 6、类中的权限修饰符
 *      （1）public：无论子类和父类在同包内，还是包外，还是任何地方，在子类中都可以调用父类的修饰符为 public 的属性或者方法
 *      （2）protected：无论子类和父类在同包内，还是包外，在子类中都可以调用父类的修饰符为 protected 的属性或者方法
 *      （3）缺省：子类和父类在同包内时，在子类中都可以调用父类的修饰符为 缺省 的属性或者方法
 *      （4）private：在任何地方，子类中都不能调用父类中的修饰符为 private 的属性或者方法
 *
 */
public class TestInheritance
{
    public static void main(String[] args)
    {
        Kids k = new Kids();

        k.setSalary(0);
        k.setSex(1);
        k.setYearsOld(13);

        k.manOrWoman();
        k.printAge();
        k.employees();

        Cylinder cy = new Cylinder();
        cy.findVolume();
        cy.findArea();
    }
}

