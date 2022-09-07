package com.github.zxbu.webdavteambition.model.result;

public class CreateFileResult {
    private String ccpFileId;
    private String nodeId;
    private String name;
    private String kind;

    public String getCcpFileId() {
        return ccpFileId;
    }

    public void setCcpFileId(String ccpFileId) {
        this.ccpFileId = ccpFileId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
