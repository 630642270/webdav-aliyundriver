package com.github.zxbu.webdavteambition.model;

public class FileListRequest extends Page{
    private String drive_id;
    private Boolean all = false;
    private String fields = "*";
    private String image_thumbnail_process = "image/resize,w_400/format,jpeg";
    private String image_url_process = "image/resize,w_1920/format,jpeg";
    private String parent_file_id;
    private String video_thumbnail_process = "video/snapshot,t_0,f_jpg,ar_auto,w_300";

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getImage_thumbnail_process() {
        return image_thumbnail_process;
    }

    public void setImage_thumbnail_process(String image_thumbnail_process) {
        this.image_thumbnail_process = image_thumbnail_process;
    }

    public String getImage_url_process() {
        return image_url_process;
    }

    public void setImage_url_process(String image_url_process) {
        this.image_url_process = image_url_process;
    }

    public String getParent_file_id() {
        return parent_file_id;
    }

    public void setParent_file_id(String parent_file_id) {
        this.parent_file_id = parent_file_id;
    }

    public String getVideo_thumbnail_process() {
        return video_thumbnail_process;
    }

    public void setVideo_thumbnail_process(String video_thumbnail_process) {
        this.video_thumbnail_process = video_thumbnail_process;
    }
}
