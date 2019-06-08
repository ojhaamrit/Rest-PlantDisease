package org.amrit.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "plant_disease")
public class PlantDisease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id;

    @Column(name = "label")
    @JsonProperty("label")
    private String label;

    @Column(name = "stage_of_infection")
    @JsonProperty("stage_of_infection")
    private String stageOfInfection;

    @Column(name = "part_of_the_plant")
    @JsonProperty("part_of_the_plant")
    private String partOfThePlant;

    @Column(name = "if_leaf")
    @JsonProperty("if_leaf")
    private String ifLeaf;

    @Column(name = "farm")
    @JsonProperty("farm")
    private String  farm;

    @Column(name = "location")
    @JsonProperty("location")
    private String location;

    @Column(name = "image")
    @JsonProperty("image")
    private String image;

    @Column(name = "comments")
    @JsonProperty("comments")
    private String comments;

    @Column(name = "temperature")
    @JsonProperty("temperature")
    private double temperature;

    @Column(name = "humidity")
    @JsonProperty("humidity")
    private double humidity;

    @Column(name = "rate_of_occurrence")
    @JsonProperty("rate_of_occurrence")
    private double rateOfOccurrence;

    @Column(name = "date")
    @JsonProperty("date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public PlantDisease() {
    }

    public PlantDisease(Long id, String label, String stageOfInfection, String partOfThePlant, String ifLeaf, String farm, String location, String image, String comments, double temperature, double humidity, double rateOfOccurrence, Date date) {
        this.id = id;
        this.label = label;
        this.stageOfInfection = stageOfInfection;
        this.partOfThePlant = partOfThePlant;
        this.ifLeaf = ifLeaf;
        this.farm = farm;
        this.location = location;
        this.image = image;
        this.comments = comments;
        this.temperature = temperature;
        this.humidity = humidity;
        this.rateOfOccurrence = rateOfOccurrence;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStageOfInfection() {
        return stageOfInfection;
    }

    public void setStageOfInfection(String stageOfInfection) {
        this.stageOfInfection = stageOfInfection;
    }

    public String getPartOfThePlant() {
        return partOfThePlant;
    }

    public void setPartOfThePlant(String partOfThePlant) {
        this.partOfThePlant = partOfThePlant;
    }

    public String getIfLeaf() {
        return ifLeaf;
    }

    public void setIfLeaf(String ifLeaf) {
        this.ifLeaf = ifLeaf;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getRateOfOccurrence() {
        return rateOfOccurrence;
    }

    public void setRateOfOccurrence(double rateOfOccurrence) {
        this.rateOfOccurrence = rateOfOccurrence;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
