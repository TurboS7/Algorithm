package javabase.duotai;

public class Job {

    public void work(){
        System.out.println("做工作");
    }

    /**1⃣️ final 类无法被继承，没有类能够继承final类的任何属性。
     * 2⃣️ 父类的方法中添加final修饰符后，子类无法重写这个方法。
     *    声明该方法的目的是防止该方法被修改
     */
    public final void finalWork(){
        System.out.println("这个方法无法被子类重写");
    }
}
