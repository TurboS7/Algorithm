package javabase.abstracts;

public class Test extends TestAbstract{
    @Override
    public void goFast() {
        System.out.println("跑的快");
    }

    @Override
    public void changeColor() {
        System.out.println("修改颜色");
    }

    public static void main(String[] args) {
        new Test().goFast();
    }
}
