package tech.emmmwinama.plaasapi.models;

import tech.emmmwinama.plaasapi.models.AbstractEntity;
import tech.emmmwinama.plaasapi.models.Vendor;

import javax.persistence.*;
import java.util.List;

@Entity
public class Expense extends AbstractEntity {
    private String date;

    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @OneToMany(mappedBy = "expense", orphanRemoval = true)
    private List<Expense_item> expense_items;

    public List<Expense_item> getExpense_items() {
        return expense_items;
    }

    public void setExpense_items(List<Expense_item> expense_items) {
        this.expense_items = expense_items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
