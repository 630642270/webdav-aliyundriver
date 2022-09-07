package com.github.zxbu.webdavteambition.model.result;

import java.util.Date;
import java.util.Objects;

public class TFile {
    private Date created_at;
    private String domain_id;
    private String drive_id;
    private String encrypt_mode;
    private String file_id;
    private Boolean hidden;
    private String name;
    private String file_name;
    private String parent_file_id;
    private String starred;
    private String status;
    private String type;
    private Date updated_at;
    private String url;
    private Long size;
    private String download_url;

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public String getEncrypt_mode() {
        return encrypt_mode;
    }

    public void setEncrypt_mode(String encrypt_mode) {
        this.encrypt_mode = encrypt_mode;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
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

    public String getStarred() {
        return starred;
    }

    public void setStarred(String starred) {
        this.starred = starred;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
