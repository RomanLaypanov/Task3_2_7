public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        for (int attempt = 0; attempt < 3; attempt++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (attempt == 2) {
                    throw e;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
