package org.amrit.api.entity;

import java.util.Date;

public class PlantDisease {
    private int id;
    private String label, stageOfInfection, partOfThePlant, ifLeaf, farm, location, image, comments;
    private Double temperature, humidity, rateOfOccurance;
    private Date date;

    public PlantDisease() {
    }

    public PlantDisease(int id, String label, String stageOfInfection, String partOfThePlant, String ifLeaf, String farm, String location, String image, String comments, Double temperature, Double humidity, Double rateOfOccurance, Date date) {
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
        this.rateOfOccurance = rateOfOccurance;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getRateOfOccurance() {
        return rateOfOccurance;
    }

    public void setRateOfOccurance(Double rateOfOccurance) {
        this.rateOfOccurance = rateOfOccurance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
