public class Robot implements RobotConnection, RobotConnectionManager {
    private int xR = 0;
    private int yR = 0;

    Robot(int xR, int yR) {
        this.xR = xR;
        this.yR = yR;
    }

    @Override
    public void moveRobotTo(int x, int y) {
        xR = x;
        yR = y;
        System.out.println("x = " + xR + ", " + "y = " + yR);
    }

    @Override
    public void close() {
        System.out.println("Соеденение закрыто");
    }

    @Override
    public RobotConnection getConnection() {
        return new RobotConnection() {
            @Override
            public void moveRobotTo(int x, int y) {

            }

            @Override
            public void close() {

            }
        };
    }
}
