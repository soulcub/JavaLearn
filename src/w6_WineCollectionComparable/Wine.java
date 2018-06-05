package w6_WineCollectionComparable;

import java.util.GregorianCalendar;

public class Wine implements Comparable <Wine>{

    private String name;
    private String country;
    private GregorianCalendar dateOfBottling;


    public Wine(String name, String country, GregorianCalendar dateOfBottling) {
        setName(name);
        setCountry(country);
        setDateOfBottling(dateOfBottling);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBottling(GregorianCalendar dateOfBottling) {
        this.dateOfBottling = dateOfBottling;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public GregorianCalendar getDateOfBottling() {
        return dateOfBottling;
    }

    public int wineExtract() {
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - dateOfBottling.get(GregorianCalendar.YEAR);
    }

    public int getWineExtract() {
        return wineExtract();
    }

    public String toString() {
        return "\nName - " + name + "\nCountry -  " + country + "\nWine extract " + wineExtract() + " years " + "\n";
    }


        public int compareTo(Wine w) {
        if (this.getWineExtract()>w.getWineExtract())
        return 1;
        else if (this.getWineExtract()<w.getWineExtract())
        return -1;
        else return 0;
    }
}