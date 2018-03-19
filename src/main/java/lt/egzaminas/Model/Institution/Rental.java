package lt.egzaminas.Model.Institution;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lt.egzaminas.Model.Institution.InstitutionEnums.RentalType;

@Entity
@DiscriminatorValue(value = "rental")
public class Rental extends Institution {

    private RentalType rentalType;

    public Rental(){}


    public Rental(String title, String city, String image, String category, RentalType rentalType) {
        super(title, city, image, category);
        this.rentalType = rentalType;
    }

    public RentalType getrentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }
}
