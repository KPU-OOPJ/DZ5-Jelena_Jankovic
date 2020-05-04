
package zadatakk5;

import java.util.ArrayList;

public class Parking {
    
    private ArrayList<ParkingMesto> mesta = new ArrayList<>();
    private int brojMesta;

    public Parking(int kapacitet) throws ParkingMestoException {

        if (kapacitet > 0)
            this.brojMesta = kapacitet;

        if (kapacitet <= 0){
            this.brojMesta = 40;
            throw new ParkingMestoException("Uneli ste broj manji od nule");
        }

        for (int i=0 ; i<brojMesta; i++){
            mesta.add(new ParkingMesto(true));
        }

    }

    public ArrayList<ParkingMesto> getMesta() {
        return mesta;
    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public boolean getMesto(int broj){
        return mesta.get(0).isSlobodno();
    }

    public String koJePrvi() {
        if(!getMesto(0))
            return mesta.get(0).getRegistarskiBroj();
        else
            return "Slobodno je";
    }

    public String koJePoslednji() {
        if(!getMesto(brojMesta-1))
            return mesta.get(brojMesta-1).getRegistarskiBroj();
        else
            return "Slobodno je";
    }

    public boolean imaLiSlobodnih() {
        for(int i = 0; i < brojMesta; i++)
            if(mesta.get(i).isSlobodno())
                return true;
         return false;
    }

    public int brojSlobodnih() {
        int broj = 0;
        for(int i = 0; i < brojMesta; i++)
            if(mesta.get(i).isSlobodno())
                broj++;
        return broj;
    }

    public boolean daLiJeNaParkingu(String registracija) {
        for(int i = 0; i < brojMesta; i++)
            if(mesta.get(i).getRegistarskiBroj().equals(registracija))
                return true;
        return false;
    }

    public String uveziNaParking(String registracija) {
        if(!imaLiSlobodnih())
            return "Parking je popunjen";
        else {
            for(int i = 0; i < brojMesta; i++) {
                if(mesta.get(i).isSlobodno()){
                    mesta.get(i).setRegistarskiBroj(registracija);
                    mesta.get(i).setSlobodno(false);
                    break;
                }
            }
        }
        return "Parkirali smo vozilo";
    }

    public String izveziSaParkinga(String registracija) {
        if(daLiJeNaParkingu(registracija)) {
            for(int i = 0; i < brojMesta; i++) {
                if(mesta.get(i).getRegistarskiBroj().equals(registracija)){
                    mesta.get(i).setSlobodno(true);
                    mesta.get(i).setRegistarskiBroj("");
                    return "Isparkiran je";
                }
            }
        }
        return "Nije bio na parkingu";
    }

    public void ispisiSlobodne() {
        for(int i = 0; i < brojMesta; i++)
            if(!mesta.get(i).isSlobodno())
                System.out.println(mesta.get(i).toString());
    }

    public String ispisiBeogradjane() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < brojMesta; i++)
            if(!mesta.get(i).isSlobodno() && mesta.get(i).getRegistarskiBroj().contains("BG"))
                sb.append("\n").append(mesta.get(i).toString());
        return sb.toString();
    }

    public String ispisiSve() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < brojMesta; i++)
            if(!mesta.get(i).isSlobodno())
                sb.append(mesta.get(i).toString()).append("\n");
        return sb.toString();
    }

  
            

    
    
    
}
