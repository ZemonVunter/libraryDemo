package top.demonhunter.demo0.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Book {

    private long bookId;
    private String name;
    private String author;
    private String publish;
    private String ISBN;
    private String introduction;
    private String language;
    private BigDecimal price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date pubDate;
    private int classId;
    private int number;
    private String className;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", introduction='" + introduction + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", pubDate=" + pubDate +
                ", classId=" + classId +
                ", number=" + number +
                ", className='" + className + '\'' +
                '}';
    }
}