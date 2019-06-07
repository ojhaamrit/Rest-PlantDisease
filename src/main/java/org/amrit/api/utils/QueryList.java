package org.amrit.api.utils;

public class QueryList {
    public static final String GET_ALL_PLANT_DISEASE = "select * from plant_disease_info";
    public static final String INSERT_PLANT_DISEASE = "insert into plant_disease_info(temperature, humidity, label, stage_of_infection, part_of_the_plant, if_leaf, data, farm, rate_of_occurance, comments, photo_url)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_PLANT_DISEASE = "UPDATE FROM plant_disease_info SET photo_url =?, comments =?, temperature =?, humidity =?, label =?, stage_of_infection =?, part_of_the_plant =?, if_leaf =?, date =?, farm =?, location =?, rate_of_occurance =? where id = ?";
    public static final String DELETE_PLANT_DISEASE = "delete from plant_disease_info where id = ?";
    public static final String GET_PLANT_DISEASE_BY_ID = "select * from plant_disease_info where id = ?";
}
