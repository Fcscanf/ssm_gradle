package com.fcant.bean;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * FilePo
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:25 2019-06-17/0017
 */
@Data
public class FilePo {

    private String description;
    private MultipartFile file;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
