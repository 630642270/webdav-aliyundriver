package com.github.zxbu.webdavteambition.model;

public class UploadPreInfo {
    private String ccpParentId;
    private int chunkCount;
    private String contentType = "";
    private String driveId;
    private String name;
    private int size;
    private String type;

    public int getChunkCount() {
        return chunkCount;
    }

    public void setChunkCount(int chunkCount) {
        this.chunkCount = chunkCount;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDriveId() {
        return driveId;
    }

    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCcpParentId() {
        return ccpParentId;
    }

    public void setCcpParentId(String ccpParentId) {
        this.ccpParentId = ccpParentId;
    }
}
