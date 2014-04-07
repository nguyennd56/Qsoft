package model;

import java.util.Date;

/**
 * Created by 3 on 3/29/2014.
 */
public class Assets {
    public int id;
    public String name;
    public Double price;
    public Date purchaseDate;

    public Assets() {
    }

    public Assets(String name, Double price, Date purchaseDate) {
        this.name = name;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
}
