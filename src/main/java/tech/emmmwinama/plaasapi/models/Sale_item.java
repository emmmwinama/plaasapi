package tech.emmmwinama.plaasapi.models;


import javax.persistence.*;

@Entity
public class Sale_item extends AbstractEntity {

    private int quantity;
    private float cost_perunit;
    private float total_price;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "inventory_item_id")
    private Inventory_item inventory_item;

    public Inventory_item getInventory_item() {
        return inventory_item;
    }

    public void setInventory_item(Inventory_item inventory_item) {
        this.inventory_item = inventory_item;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost_perunit() {
        return cost_perunit;
    }

    public void setCost_perunit(float cost_perunit) {
        this.cost_perunit = cost_perunit;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }
}
