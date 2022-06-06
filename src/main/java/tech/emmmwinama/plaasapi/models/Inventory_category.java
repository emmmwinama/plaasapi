package tech.emmmwinama.plaasapi.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Inventory_category extends AbstractEntity{
    private String name;
    private String category;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventory_item> inventory_items;

    public List<Inventory_item> getInventory_items() {
        return inventory_items;
    }

    public void setInventory_items(List<Inventory_item> inventory_items) {
        this.inventory_items = inventory_items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
