package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Diviner on 2018/2/10.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
