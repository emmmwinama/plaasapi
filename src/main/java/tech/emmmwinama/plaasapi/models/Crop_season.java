package tech.emmmwinama.plaasapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Crop_season extends AbstractEntity{
    private String start_date;
    private String end_date;
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "crop_id", nullable = false)
    private Crop crop;

    private String variety;
    private String description;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "yield_id", nullable = false)
    private Yield yield;

    @OneToMany(mappedBy = "crop_season", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Linked_area> linked_areas;

    @OneToMany(mappedBy = "crop_season", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Linked_area> getLinked_areas() {
        return linked_areas;
    }

    public void setLinked_areas(List<Linked_area> linked_areas) {
        this.linked_areas = linked_areas;
    }

    public Yield getYield() {
        return yield;
    }

    public void setYield(Yield yield) {
        this.yield = yield;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
