public class ShortestPath{

    public static double Sp(String path) {

        double x = 0;
        double y = 0;

        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            if (dir == 'E') {
                x++;
            }
            else if (dir == 'W') {
                x--;
            }
            else if (dir == 'S') {
                y--;
            }
            else if (dir == 'N') {
                y++;
            }
        }

        double X2 = x * x;
        double Y2 = y * y;

        return Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        System.out.println(Sp("WNEENESENNN"));
    }
}