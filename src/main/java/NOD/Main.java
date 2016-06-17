package NOD;

/**
 * Created by malex on 17.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(nod_numbers(30, -3));
    }

    //Two numbers
    static int nod_numbers(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod_numbers(b, a % b);
    }
}
