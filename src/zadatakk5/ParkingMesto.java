
package zadatakk5;

public class ParkingMesto {
    
    private boolean slobodno;
    
    private String registarskiBroj;
  
    public ParkingMesto(boolean slobodno) {
        this.slobodno = slobodno;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public boolean isSlobodno() {
        return slobodno;
    }

    public void setSlobodno(boolean slobodno) {
        this.slobodno = slobodno;
    }
    
    @Override
    public String toString() {
        return "ParkingMesto{" +
                "slobodno=" + slobodno +
                ", registarskiBroj='" + registarskiBroj + '\'' +
                '}';
    }
    
}


