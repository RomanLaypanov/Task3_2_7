public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnectionException lastException = null;

        for (int attempt = 0; attempt < 3; attempt++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
                lastException = e;
            } catch (Exception e) {
                throw e;
            }
        }

        throw new RobotConnectionException("Не удалось после 3 попыток", lastException);
    }
}
