package lt.egzaminas.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import lt.egzaminas.Model.Institution.Institution;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue
    @NotNull
    private long id;

    private String title;

    private String author;

    private long pages;

    private String image;

    private double price;

    private String condition;

    private long quantity;

    @ManyToMany(mappedBy = "books")
    @JsonIgnore
    private List<Institution> institutions = new ArrayList<>();

    public Book(){

    }

    public Book(String title, String author, long pages, String image, double price, String condition, long quantity) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.image = image;
        this.price = price;
        this.condition = condition;
        this.quantity = quantity;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public List<Institution> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<Institution> institutions) {
        this.institutions = institutions;
    }
}
