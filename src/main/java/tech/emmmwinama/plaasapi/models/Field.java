package tech.emmmwinama.plaasapi.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Field extends AbstractEntity{
    private String name;
    private String location;
    private float usable_area;
    private String soil_type;
    private String ownership;
    private String description;

    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Linked_area> linked_areas;

    public List<Linked_area> getLinked_areas() {
        return linked_areas;
    }

    public void setLinked_areas(List<Linked_area> linked_areas) {
        this.linked_areas = linked_areas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getUsable_area() {
        return usable_area;
    }

    public void setUsable_area(float usable_area) {
        this.usable_area = usable_area;
    }

    public String getSoil_type() {
        return soil_type;
    }

    public void setSoil_type(String soil_type) {
        this.soil_type = soil_type;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
