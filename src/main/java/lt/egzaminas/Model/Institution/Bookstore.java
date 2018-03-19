package lt.egzaminas.Model.Institution;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lt.egzaminas.Model.Institution.InstitutionEnums.LibraryBookstoreType;

@Entity
@DiscriminatorValue(value = "store")
public class Bookstore extends Institution {

    private LibraryBookstoreType libraryBookstoreType;

    public Bookstore(){
    	
    }

    public Bookstore(String title, String city, String image, String category, LibraryBookstoreType libraryBookstoreType) {
        super(title, city, image, category);
        this.libraryBookstoreType = libraryBookstoreType;
    }

    public LibraryBookstoreType getLibraryBookstoreType() {
        return libraryBookstoreType;
    }

    public void setLibraryBookstoreType(LibraryBookstoreType libraryBookStoreType) {
        this.libraryBookstoreType = libraryBookStoreType;
    }
}
