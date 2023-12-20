public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int mins, int secs){
        this.hours = hours;
        minutes = mins;
        seconds = secs;

    }

    public String info(){
        String display = "";
        if (hours < 10){
            display += "0" + hours;
        } else {
            display += hours;
        }
        if (minutes < 10) {
            display += ":0" + minutes;
        } else {
            display += ":" + minutes;
        }
        if (seconds < 10){
            display += ":0" + seconds;
        } else {
            display += ":" + seconds;
        }
        return display;
    }

    public void tick(){
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes++;
        }
        if (minutes == 60){
            minutes = 0;
            hours++;
        }
        if (hours == 24){
            hours = 0;
        }
    }

    public void add(Time time1){
        int timeHours = Integer.parseInt(time1.info().substring(0,2));
        int timeMins = Integer.parseInt(time1.info().substring(3,5));
        int timeSecs = Integer.parseInt(time1.info().substring(6));
        if ((seconds + timeSecs) > 59){
            seconds = (seconds + timeSecs) - 60;
            minutes++;
        } else {
            seconds += timeSecs;
        }
        if ((minutes + timeMins) > 59){
            minutes = (minutes + timeMins) - 60;
            hours ++;
        } else {
            minutes += timeMins;
        }
        if ((hours + timeHours) > 23){
            hours = (hours + timeHours) - 24;
        } else {
            hours += timeHours;
        }
    }

}
