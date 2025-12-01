package OOPS;

public class oops {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        p1.tip = 6;
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
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