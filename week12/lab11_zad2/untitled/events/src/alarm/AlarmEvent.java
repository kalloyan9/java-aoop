package alarm;

public class AlarmEvent {
    private int nrings; // 1 by default

    public AlarmEvent(int nrings) {
        setNrings(nrings);
    }

    public int getNrings() {
        return nrings;
    }

    public void setNrings(int nrings) {
        if (nrings < 1) nrings = 1;
        this.nrings = nrings;
    }
}
