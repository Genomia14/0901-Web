package me.shinsunyoung.springbootdeveloper.util;

import me.shinsunyoung.springbootdeveloper.dto.UploadFileDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FileUtil {
    @Value("${org.zerock.upload.path}")
    private String uploadDir;

    public List<FileNameUtil> uploadFile(UploadFileDTO uploadFileDTO) {
        List<FileNameUtil> nameList = new ArrayList<>();
        if (uploadFileDTO.getFiles() != null) {
            for (MultipartFile file : uploadFileDTO.getFiles()) {
                // 원본, 새로운 파일 이름 저장
                String originalName = file.getOriginalFilename();
                String uuid = UUID.randomUUID().toString();
                Path path = Paths.get(uploadDir, uuid + "_" + originalName);
                try {
                    file.transferTo(path); // 파일 저장
                    // 원본 파일 이름 저장
                    nameList.add(FileNameUtil.builder()
                            .originalFileName(originalName)
                            .newFileName(uuid + "_" + originalName)
                            .build());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return nameList;
    }

    public boolean fileRemove(String fileName) {
        Resource resource = new FileSystemResource(
                uploadDir + File.separator + fileName);
        String resourceName = resource.getFilename();

        Map<String, Boolean> resultMap = new HashMap<>();
        boolean removed = false;
        try {
            String contentType = Files.probeContentType((resource.getFile().toPath()));
            if (contentType.startsWith("image/")) {
                // 썸네일 삭제 코드
            }
            // 원본 파일 삭제 후 결과 저장
            removed = resource.getFile().delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 정상 처리시 삭제 결과
        return removed;
    }
}

