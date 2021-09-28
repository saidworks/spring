
package com.example.capgeminitmh;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;






@CrossOrigin
@RestController
@RequestMapping("/api/upload/")
public class MultipleFilesUploadController {

    @PostMapping(value="/")
    public ResponseEntity<Void> uploadPolicyDocument(@RequestParam("file") List<MultipartFile> multipartFile)
    {
        // Note the trailing \\ characters
        String OUT_PATH = "/home/saidworks/Desktop/Java/";

        try {


            for(MultipartFile mf: multipartFile)
            {
                byte[] bytes = mf.getBytes();
                Path path = Paths.get(OUT_PATH + mf.getOriginalFilename());
                Files.write(path, bytes);
            }

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok().build();
    }

//    @GetMapping("/files")
//    public ResponseEntity<List<FileInfo>> getListFiles() {
//        List<FileInfo> fileInfos = storageService.loadAll().map(path -> {
//            String filename = path.getFileName().toString();
//            String url = MvcUriComponentsBuilder
//                    .fromMethodName(FilesController.class, "getFile", path.getFileName().toString()).build().toString();
//
//            return new FileInfo(filename, url);
//        }).collect(Collectors.toList());
//
//        return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
//    }
}