package tech.emmmwinama.plaasapi.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Sale extends AbstractEntity {
    private String date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sale_item> sale_items;

    public List<Sale_item> getSale_items() {
        return sale_items;
    }

    public void setSale_items(List<Sale_item> sale_items) {
        this.sale_items = sale_items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
