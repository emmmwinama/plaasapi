package tech.emmmwinama.plaasapi.models;

import javax.persistence.*;

@Entity
public class Expense_item extends AbstractEntity {
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;



    private Long quantity;
    private float cost_perunit;
    private float total_price;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "inventory_item_id")
    private Inventory_item inventory_item;

    public Inventory_item getInventory_item() {
        return inventory_item;
    }

    public void setInventory_item(Inventory_item inventory_item) {
        this.inventory_item = inventory_item;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
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
