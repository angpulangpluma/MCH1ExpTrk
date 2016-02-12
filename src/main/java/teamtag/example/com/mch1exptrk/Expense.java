package teamtag.example.com.mch1exptrk;

import java.util.Date;

/**
 * Created by YING LOPEZ on 2/10/2016.
 */
public class Expense {
    private String name;
    private double price;
    private Date d;

    public Expense(String name, double price, Date d){
        this.name = name;
        this.price = price;
        this.d = d;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public Date getDate(){
        return d;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDate(Date d){
        this.d = d;
    }
}
