package com.audio.Audio_Transciber;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/audio")
public class TranscriptionController {
    @Autowired
    AudioService audioService;

    @PostMapping("/transcribe")
    public ResponseEntity<String> transcribe(@RequestParam("file")MultipartFile file) throws IOException {
        File tempFile= File.createTempFile("audio", "wav");
        file.transferTo(tempFile);
        FileSystemResource audioFile= new FileSystemResource((tempFile));
        //tempFile.delete();
        return new ResponseEntity<>(audioService.transcribe(audioFile), HttpStatus.OK);
    }
}
