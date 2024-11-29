package A6;

public class Flugbahn {
    public static void main(String[] args) {
        // Zeichenblatt erzeugen
        Zeichenblatt zb = new Zeichenblatt(600,600);

        // Koordinatensystem definieren
        zb.benutzerkoordinaten(0.0, 0.0, 600.0, 600.0);

        double G = 9.8;
        double C = 0.002;

        // Startposition
        double x = 0.0;
        double y = 0.0;
        // Startgeschwindigkeit
        double v = Double.parseDouble(args[0]);
        // Winkel
        double theta = Double.parseDouble(args[1]);
        // Winkel in Radiant umwandeln
        theta = theta * Math.PI /180.0;
        // initialen Geschwindigkeitsvektor
        double vx = x * Math.cos(theta);
        double vy = y * Math.sin(theta);
        // Beschleunigung
        double ax = 0.0;
        double ay = 0.0;
        // Startzeit
        double t = 0.0;
        // Zeitspruenge
        double dt = 0.01;

        // Simulationsschleife bis Koerper wieder Boden erreicht (y =0)
        while (y>=0){
            // Betrag Geschwindigkeit
            v = Math.sqrt(vx*vx + vy*vy);
            // Beschleunigungsvektor
            ax = -C*v*vx;
            ay = -G-C*v*vx;
            // Geschwindigkeitsvektor
            vx = vx + ax*dt;
            vy = vy + ay*dt;

            // Positionsvektor veraendern
            x += vx * dt;
            y +=vy * dt;
            // anzeigen und 10 ms warten
            zb.punkt(x,y,1.0);
            zb.anzeigen();
            zb.pause(10);
        }

    }
}
