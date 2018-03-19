package lt.egzaminas.Model.Institution;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lt.egzaminas.Model.Institution.InstitutionEnums.LibraryBookstoreType;

@Entity
@DiscriminatorValue(value = "library")
public class Library extends Institution {


    private LibraryBookstoreType libraryBookstoreType;

    public Library(){}

    public Library(String title, String city, String image, String category, LibraryBookstoreType libraryBookstoreType) {
        super(title, city, image, category);
        this.libraryBookstoreType = libraryBookstoreType;
    }

    public LibraryBookstoreType getLibraryBookstoreType() {
        return libraryBookstoreType;
    }

    public void setLibraryBookStoreType(LibraryBookstoreType libraryBookstoreType) {
        this.libraryBookstoreType = libraryBookstoreType;
    }
}
