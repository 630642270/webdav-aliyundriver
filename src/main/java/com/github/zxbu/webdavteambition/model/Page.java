package com.github.zxbu.webdavteambition.model;

public class Page {
    private String marker;
    private int limit;
    private String order_by;
    private String order_direction;

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public String getOrder_direction() {
        return order_direction;
    }

    public void setOrder_direction(String order_direction) {
        this.order_direction = order_direction;
    }
}
