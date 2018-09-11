package gameco.king.lbstest;

public class Gps {
    private double WgLat;
    private double WgLon;

    public Gps() {
    }

    public Gps(double wgLat, double wgLon) {
        WgLat = wgLat;
        WgLon = wgLon;
    }

    public double getWgLat() {
        return WgLat;
    }

    public void setWgLat(double wgLat) {
        WgLat = wgLat;
    }

    public double getWgLon() {
        return WgLon;
    }

    public void setWgLon(double wgLon) {
        WgLon = wgLon;
    }
}
