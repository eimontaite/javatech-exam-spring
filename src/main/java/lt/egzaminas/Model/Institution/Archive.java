package lt.egzaminas.Model.Institution;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lt.egzaminas.Model.Institution.InstitutionEnums.ArchiveType;

@Entity
@DiscriminatorValue(value = "archive")
public class Archive extends Institution {

    private ArchiveType archiveType;

    public Archive(){}

    public Archive(String title, String city, String image, String category, ArchiveType archiveType) {
        super(title, city, image, category);
        this.archiveType = archiveType;
    }

    public ArchiveType getArchiveType() {
        return archiveType;
    }

    public void setArchiveType(ArchiveType archiveType) {
        this.archiveType = archiveType;
    }
}
