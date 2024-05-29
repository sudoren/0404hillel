package lesson11;

public class TicketMachine {

    public static int calculateFare (String type, String zone) {
        switch (type) {
            case "BUS":
                if (zone == "zone1") {
                    return TransportType.BUS.getZone1();
                }
                if (zone == "zone2") {
                    return TransportType.BUS.getZone2();
                }
                if (zone == "zone3") {
                    return TransportType.BUS.getZone3();
                }
                break;
            case "TRAIN":
                if (zone == "zone1") {
                    return TransportType.TRAIN.getZone1();
                }
                if (zone == "zone2") {
                    return TransportType.TRAIN.getZone2();
                }
                if (zone == "zone3") {
                    return TransportType.TRAIN.getZone3();
                }
                break;
            case "METRO":
                if (zone == "zone1") {
                    return TransportType.METRO.getZone1();
                }
                if (zone == "zone2") {
                    return TransportType.METRO.getZone2();
                }
                if (zone == "zone3") {
                    return TransportType.METRO.getZone3();
                }
                break;
            default:
                return 0;


        }
        return 0;
    }
}