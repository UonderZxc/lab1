package lab1;

public class TestBall {
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Yellow", 15, "Volleyball");
        Ball b2 = new Ball("Red", 15);
        b2.setGame("Football");
        System.out.println(b1);
        System.out.println(b1.output());
        System.out.println(b2.output());
    }
}
