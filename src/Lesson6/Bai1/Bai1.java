package Lesson6.Bai1;

public class Bai1 {
    class Point {
        private int x;
        private int y;

        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void displayPoints() {
            System.out.println("Point(" + x + ", " + y + ")");
        }

        public boolean equals(Point other) {
            return this.x == other.x && this.y == other.y;
        }
    }
    public static void main(String[] args) {

        Point point1 = new Point(5, 10);
        Point point2 = new Point(5, 10);

        point1.displayPoints();
        point2.displayPoints();


        if (point1.equals(point2)) {
            System.out.println("Các điểm giống nhau");
        } else {
            System.out.println("Các điểm khác nhau");
        }
    }
}


