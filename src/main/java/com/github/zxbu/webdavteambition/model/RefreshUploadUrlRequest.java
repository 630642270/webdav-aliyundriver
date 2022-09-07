package com.github.zxbu.webdavteambition.model;

import java.util.List;

public class RefreshUploadUrlRequest {
    private String drive_id;
    private List<UploadPreRequest.PartInfo> part_info_list;
    private String file_id;
    private String upload_id;

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public List<UploadPreRequest.PartInfo> getPart_info_list() {
        return part_info_list;
    }

    public void setPart_info_list(List<UploadPreRequest.PartInfo> part_info_list) {
        this.part_info_list = part_info_list;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getUpload_id() {
        return upload_id;
    }

    public void setUpload_id(String upload_id) {
        this.upload_id = upload_id;
    }
}
