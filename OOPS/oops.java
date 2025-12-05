package OOPS;

public class oops {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("Yellow");
        p1.setTip(6);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setcolor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentge; //CGPA

    void calcPercentage(int phy, int chem, int math) {
        percentge = (phy + chem + math) / 3;
    }
}