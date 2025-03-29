public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            try(Robot robot = new Robot(1, 3);) {
                robot.robotTurnOn();
                if (robot.getConnection() instanceof RobotConnection) {
                    robot.moveRobotTo(6, 5);

                    return;
                }
            } catch (RobotConnectionException e) {
                throw new RobotConnectionException("Соединение не установленно");
            }
        }
    }
}