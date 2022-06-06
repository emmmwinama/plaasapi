package tech.emmmwinama.plaasapi.models;

import javax.persistence.*;

@Entity
public class Inventory_item extends AbstractEntity {
    private String name;


    private String manufacturer;
    private String unit_of_measure;
    private float quantity;
    private String description;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH}, optional = false)
    @JoinColumn(name = "inventory_category_id", nullable = false)
    private Inventory_category category;

    @OneToOne(mappedBy = "inventory_item", orphanRemoval = true)
    private Expense_item expense_item;

    @OneToOne(mappedBy = "inventory_item", orphanRemoval = true)
    private Sale_item sale_item;

    public Sale_item getSale_item() {
        return sale_item;
    }

    public void setSale_item(Sale_item sale_item) {
        this.sale_item = sale_item;
    }

    public Expense_item getExpense_item() {
        return expense_item;
    }

    public void setExpense_item(Expense_item expense_item) {
        this.expense_item = expense_item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Inventory_category getCategory() {
        return category;
    }

    public void setCategory(Inventory_category category) {
        this.category = category;
    }
}

