package com.example.buyogo.demo.TrainingCentre;

import com.example.buyogo.demo.TrainingCentre.dto.TrainingCenterResponseDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    // POST API to create a new Training Center
    @PostMapping
    public ResponseEntity<TrainingCenterResponseDto> createTrainingCenter(
            @Valid @RequestBody TrainingCenterRequestDto requestDto) {
        TrainingCenterResponseDto responseDto = trainingCenterService.createTrainingCenter(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }


 //GET API to retrieve all Training Centers
 @GetMapping
 public ResponseEntity<List<TrainingCenterResponseDto>> getAllTrainingCenters() {
     List<TrainingCenterResponseDto> trainingCenters = trainingCenterService.getAllTrainingCenters();
     return ResponseEntity.ok(trainingCenters);
 }

}
