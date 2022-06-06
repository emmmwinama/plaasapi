package tech.emmmwinama.plaasapi.models;

import javax.persistence.*;

@Entity
public class Linked_area extends AbstractEntity {


    private float area;
    private String production_type;
    private String description;

    @ManyToOne
    @JoinColumn(name = "crop_season_id")
    private Crop_season crop_season;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "field_id", nullable = false)
    private Field field;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }


    public Crop_season getCrop_season() {
        return crop_season;
    }

    public void setCrop_season(Crop_season crop_season) {
        this.crop_season = crop_season;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getProduction_type() {
        return production_type;
    }

    public void setProduction_type(String production_type) {
        this.production_type = production_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
