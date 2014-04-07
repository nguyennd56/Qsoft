package qsoft.model;

import java.util.Date;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
 */
public class Assets {

    public int id;
    public String name;
    public String price;
    public Date purchaseDate;

    public Assets(String name, String price, Date purchaseDate) {
        this.name = name;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public Assets(int id, String name, String price, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
