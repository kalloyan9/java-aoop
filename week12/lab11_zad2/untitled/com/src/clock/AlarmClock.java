package clock;

import alarm.AlarmActionEventHandler;
import alarm.AlarmEvent;

public class AlarmClock {
    private AlarmActionEventHandler alarm;
    private int nrings; // define in the constructor

    public AlarmClock(AlarmActionEventHandler alarm, int nrings) {
        this.alarm = alarm;
        this.nrings = nrings;
    }

    public AlarmActionEventHandler getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmActionEventHandler alarm) {
        this.alarm = alarm;
    }

    public int getNrings() {
        return nrings;
    }

    public void setNrings(int nrings) {
        if (nrings < 1) nrings = 1;
        this.nrings = nrings;
    }

    public void onAlarm(AlarmEventArgs e)
    {
        if (alarm != null)
        {
            //Invoke the event handler.
            alarm(e);
        }
    }

    private void alarm(AlarmEventArgs e) {
        alarm(e);
    }

}
    // event handling method
    public void start()
    {
        for (;;)
        {
            nrings--;
            if (nrings<0)
            {
                break;
            }

            else
            {
                AlarmEventArgs e = new AlarmEventArgs(nrings);
                OnAlarm(e);
            }
        }
    }

}
