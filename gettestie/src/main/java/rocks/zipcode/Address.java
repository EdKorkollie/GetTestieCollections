package java.rocks.zipcode;

public class Address implements Comparable<Address>{
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

    @Override
    public int compareTo(Address o) {
        int countrycompare = this.country.compareTo(o.country);
        if(countrycompare != 0) {
            return countrycompare;
        }
        int postalcompare = this.postCode.compareTo(o.postCode);
        if(postalcompare != 0) {
            return postalcompare;
        }
        int townCompare = this.town.compareTo(o.town);
        if(townCompare !=0 ){
            return townCompare;
        }
        return this.street.compareTo(o.street);
    }
}
