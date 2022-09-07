package com.github.zxbu.webdavteambition.store;

import com.github.zxbu.webdavteambition.model.FileType;
import com.github.zxbu.webdavteambition.model.result.TFile;
import com.github.zxbu.webdavteambition.model.result.UploadPreResult;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 虚拟文件（用于上传时，列表展示）
 */
@Service
public class VirtualTFileService {
    private final Map<String, Map<String, TFile>> virtualTFileMap = new ConcurrentHashMap<>();

    /**
     * 创建文件
     */
    public void createTFile(String parentId, UploadPreResult uploadPreResult) {
        Map<String, TFile> tFileMap = virtualTFileMap.computeIfAbsent(parentId, s -> new ConcurrentHashMap<>());
        tFileMap.put(uploadPreResult.getFile_id(), convert(uploadPreResult));
    }

    public void updateLength(String parentId, String fileId, long length) {
        Map<String, TFile> tFileMap = virtualTFileMap.get(parentId);
        if (tFileMap == null) {
            return;
        }
        TFile tFile = tFileMap.get(fileId);
        if (tFile == null) {
            return;
        }
        tFile.setSize(tFile.getSize() + length);
        tFile.setUpdated_at(new Date());
    }

    public void remove(String parentId, String fileId) {
        Map<String, TFile> tFileMap = virtualTFileMap.get(parentId);
        if (tFileMap == null) {
            return;
        }
        tFileMap.remove(fileId);
    }

    public Collection<TFile> list(String parentId) {
        Map<String, TFile> tFileMap = virtualTFileMap.get(parentId);
        if (tFileMap == null) {
            return Collections.emptyList();
        }
        return tFileMap.values();
    }

    private TFile convert(UploadPreResult uploadPreResult) {
        TFile tFile = new TFile();
        tFile.setCreated_at(new Date());
        tFile.setFile_id(uploadPreResult.getFile_id());
        tFile.setName(uploadPreResult.getFile_name());
        tFile.setType(FileType.file.name());
        tFile.setUpdated_at(new Date());
        tFile.setSize(0L);
        return tFile;
    }
}
