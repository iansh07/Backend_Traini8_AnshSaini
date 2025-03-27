package com.example.buyogo.demo.TrainingCentre;

import com.example.buyogo.demo.TrainingCentre.dto.TrainingCenterResponseDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    @Transactional
    public TrainingCenterResponseDto createTrainingCenter(TrainingCenterRequestDto dto) {
        TrainingCenterEntity entity = new TrainingCenterEntity();
        entity.setTrainingCenterName(dto.getTrainingCenterName());
        entity.setCenterCode(dto.getCenterCode());
        entity.setAddress(dto.getAddress());
        entity.setStudentStrength(dto.getStudentStrength());
        entity.setCourses(dto.getCourses());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNum());

        entity.setCreatedOn(Instant.now().getEpochSecond());
        TrainingCenterEntity savedEntity = repository.save(entity);
        return mapToResponseDto(savedEntity);
    }

    public List<TrainingCenterResponseDto> getAllTrainingCenters() {
        return repository.findAll().stream()
                .map(this::mapToResponseDto)
                .collect(Collectors.toList());
    }

    private TrainingCenterResponseDto mapToResponseDto(TrainingCenterEntity entity) {
        return new TrainingCenterResponseDto(
                entity.getId(),
                entity.getTrainingCenterName(),
                entity.getCenterCode(),
                entity.getAddress(),
                entity.getStudentStrength(),
                entity.getCourses(),
                entity.getEmail(),
                entity.getPhoneNumber(),
                entity.getCreatedOn()
        );
    }
}
