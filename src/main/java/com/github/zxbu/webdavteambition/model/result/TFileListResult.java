package com.github.zxbu.webdavteambition.model.result;

import java.util.List;

public class TFileListResult<T> {
    private List<T> items;
    private String next_marker;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public String getNext_marker() {
        return next_marker;
    }

    public void setNext_marker(String next_marker) {
        this.next_marker = next_marker;
    }
}
