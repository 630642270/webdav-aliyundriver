package com.github.zxbu.webdavteambition.model;

import java.util.List;

public class MoveRequest {
    private String drive_id;
    private String file_id;
    private String to_parent_file_id;

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getTo_parent_file_id() {
        return to_parent_file_id;
    }

    public void setTo_parent_file_id(String to_parent_file_id) {
        this.to_parent_file_id = to_parent_file_id;
    }
}
