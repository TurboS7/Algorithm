package javabase.abstracts;

 abstract class TestAbstract {
     private double price;
     private String model;
     private String year;

     /**
      * 抽象方法
      * 抽象方法没有任何的实现的方法，该方法的实现由子类提供。
      * 抽象的方法不能被声明为final和static。
      */
     public abstract void goFast(); //抽象方法
     public abstract void changeColor();
}
