public class Main {
    public static void main(String[] args) {
        boolean attempt = false;

        for (int i = 0; !attempt && (i < 3); ++i) {
            try ( Robot robot = new Robot(1, 2)) {
                RobotConnection connection = robot.getConnection();

                if (connection != null) {
                    robot.moveRobotTo(5, 9);
                    attempt = true;
                } else {
                    System.out.println("Соединение не удалось установить.");
                }
            } catch (RobotConnectionException ignored) {
            }
        }

        if (!attempt) {
            throw new RobotConnectionException("Соединение не установленно");
        }
    }
}