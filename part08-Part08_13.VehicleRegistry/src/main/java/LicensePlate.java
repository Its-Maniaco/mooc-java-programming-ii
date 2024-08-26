
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(LicensePlate object) {
        // check same address
        if (this == object) return true;

        // check type
        if (!(object instanceof LicensePlate)) return false;

        // typecase then check instance variables
        LicensePlate comparedObject = (LicensePlate) object;

        if (comparedObject.liNumber.equals(this.liNumber) && comparedObject.country.equals(this.country))
            return true;

        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

}
