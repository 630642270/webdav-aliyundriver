package com.github.zxbu.webdavteambition.model;

public class RenameRequest {
    private String check_name_mode = "refuse";
    private String drive_id;
    private String name;
    private String file_id;

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

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }
}
