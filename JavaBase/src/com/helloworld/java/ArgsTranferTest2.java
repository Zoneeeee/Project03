package com.helloworld.java;

/**
 * @author sunjiacheng
 * @create 2019-10-09-9:53
 */
class Value
{
    int i = 15;
}

public class ArgsTranferTest2
{
    public static void main(String[] args)
    {
        ArgsTranferTest2 t = new ArgsTranferTest2();
        t.first();
    }
    public void first()
    {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);  //20
    }
    public void second(Value v, int i)
    {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);   //15   0
    }
}
