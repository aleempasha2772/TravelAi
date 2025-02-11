package com.example.TravelAi.Model;


import java.time.LocalDate;

public class TravelInput {
    private String CityName;
    private LocalDate localDate;
    private Integer TotalCount;
    private Integer TotalDays;

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Integer getTotalDays() {
        return TotalDays;
    }

    public void setTotalDays(Integer totalDays) {
        TotalDays = totalDays;
    }

    @Override
    public String toString() {
        return "TravelInput{" +
                "CityName='" + CityName + '\'' +
                ", localDate=" + localDate +
                ", TotalCount=" + TotalCount +
                ", TotalDays=" + TotalDays +
                '}';
    }
}
