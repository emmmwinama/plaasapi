package tech.emmmwinama.plaasapi.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Yield extends AbstractEntity{
    private float yield;
    private String unit;
    private String description;

    @OneToOne(mappedBy = "yield")
    private Crop_season season;

    public float getYield() {
        return yield;
    }

    public void setYield(float yield) {
        this.yield = yield;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
