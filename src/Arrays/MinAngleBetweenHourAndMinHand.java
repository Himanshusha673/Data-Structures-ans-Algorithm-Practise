package Arrays;

public class MinAngleBetweenHourAndMinHand {
    public double angleClock(int hour, int min) {
        // angle cover by hour hand
        double theta1= 30*hour+0.5*min;
        //angle cover by minute hand
        double theta2=6*min;

        double angle=Math.abs(theta1-theta2);
        return (angle>180)?360-angle:angle;

    }
}
