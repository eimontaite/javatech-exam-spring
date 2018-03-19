package lt.egzaminas.Model.Institution;

import lt.egzaminas.Model.Institution.InstitutionEnums.*;

public class InstitutionCreate {

	//define institution attributes 
	
    private InstitutionType institutionType;

    private String title;

    private String city;

    private String image;

    private String category;

    private LibraryBookstoreType libraryBookstoreType;

    private RentalType rentalType;

    private ArchiveType archiveType;

    public InstitutionType getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(InstitutionType institutionType) {
        this.institutionType = institutionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LibraryBookstoreType getLibraryBookstoreType() {
        return libraryBookstoreType;
    }

    public void setLibraryBookstoreType(LibraryBookstoreType libraryBookstoreType) {
        this.libraryBookstoreType = libraryBookstoreType;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public ArchiveType getArchiveType() {
        return archiveType;
    }

    public void setArchiveType(ArchiveType archiveType) {
        this.archiveType = archiveType;
    }
}
