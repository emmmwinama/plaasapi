package tech.emmmwinama.plaasapi.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Crop extends AbstractEntity{
    private String name;
    private String category;

    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Crop_season> crop_seasons;

    public List<Crop_season> getCrop_seasons() {
        return crop_seasons;
    }

    public void setCrop_seasons(List<Crop_season> crop_seasons) {
        this.crop_seasons = crop_seasons;
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
