package lt.egzaminas.Model.Institution;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lt.egzaminas.Model.Book;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "institution")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "institution_type")
public class Institution implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String city;

    private String image;

    private String category;

    //Set because MtM requires such; see Book model
    @ManyToMany(cascade = {CascadeType.ALL})
    private Set<Book> books = new HashSet<>();

    //required constructor
    public Institution() {
    }

    public Institution(String title, String city, String image, String category) {
        this.title = title;
        this.city = city;
        this.image = image;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
