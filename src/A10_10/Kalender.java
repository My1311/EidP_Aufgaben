package A10_10;

public class Kalender {
    public static void main(String[] args) {
        Jahr erste = new Jahr(2021);
        Jahr zweite =new Jahr(2022);
        erste.eintragen(45,"Klausur",1);
        zweite.eintragen(37,"Treffen", 5);

        // ob am 17. Tag des Jahres 2021 ein Termin vorliegt
        erste.getTermin(17);
        // ob am 45. Tag des Jahres 2021 ein Termin vorliegt
        erste.getTermin(45);

        if(erste.getTermin(17) == null) {
            System.out.println("17. Tag ist frei");
        }
        else {
            System.out.println("17. Tag ist belegt");
        }
        if(erste.getTermin(45)== null) {
            System.out.println("45. Tag ist frei");
        }
        else {
            System.out.println("45. Tag ist belegt");
        }
        System.out.println("Belegte Tage ingesamt:"+ (erste.getBelegt()+ zweite.getBelegt()));
    }

}
