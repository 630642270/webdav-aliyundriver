package com.github.zxbu.webdavteambition.model;

public class CreateFileRequest {
    private String check_name_mode = "refuse";
    private String drive_id;
    private String name;
    private String parent_file_id;
    private String type;

    public String getCheck_name_mode() {
        return check_name_mode;
    }

    public void setCheck_name_mode(String check_name_mode) {
        this.check_name_mode = check_name_mode;
    }

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent_file_id() {
        return parent_file_id;
    }

    public void setParent_file_id(String parent_file_id) {
        this.parent_file_id = parent_file_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
