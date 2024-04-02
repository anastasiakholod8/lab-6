public class two {
    public static void main(String[] args) {
        double leg1 = 3;
        double leg2 = 4;

        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        double area = 0.5 * leg1 * leg2;
        double perimeter = leg1 + leg2 + hypotenuse;

        System.out.println("Довжина першого катета: " + leg1);
        System.out.println("Довжина другого катета: " + leg2);
        System.out.println("Довжина гіпотенузи: " + hypotenuse);
        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);
    }
}
