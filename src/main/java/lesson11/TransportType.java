package lesson11;

public enum TransportType {
    BUS (5, 7, 9),
    METRO(6, 8, 10),
    TRAIN (4, 3, 3);

    private int zone1; int zone2; int zone3;
    private TransportType(int zone1, int zone2, int zone3){
        this.zone1 = zone1;
        this.zone2 = zone2;
        this.zone3 = zone3;
    }

    public int getZone1() {
        return zone1;
    }

    public int getZone2() {
        return zone2;
    }

    public int getZone3() {
        return zone3;
    }
}
