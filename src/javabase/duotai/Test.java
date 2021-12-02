package javabase.duotai;

public class Test {
    public static void main(String[] args) {
        Job job = new Job();
        job.work();

        Job job1 = new Cooking();
        job1.work();

        Job job2 = new Doctor();
        job2.work();
    }
}
