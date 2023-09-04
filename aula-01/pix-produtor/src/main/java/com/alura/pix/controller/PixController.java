package com.alura.pix.controller;

import com.alura.pix.dto.PixDTO;
import com.alura.pix.dto.PixStatus;
import com.alura.pix.repository.PixRepository;
import com.alura.pix.service.PixService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pix")
@RequiredArgsConstructor
public class PixController {


    private final PixService pixService;
    private final PixRepository pixrepository;

    @PostMapping
    public PixDTO salvarPix(@RequestBody PixDTO pixDTO) {

        pixDTO.setIdentifier( UUID.randomUUID().toString() );
        pixDTO.setDataTransferencia( LocalDateTime.now() );
        pixDTO.setStatus( PixStatus.EM_PROCESSAMENTO );

        return pixService.salvarPix( pixDTO );
    }

    @GetMapping
    public ResponseEntity<List<PixDTO>> findAll() {
        return ResponseEntity.ok( pixrepository.findAll().stream().map( PixDTO::toDTO ).toList() );
    }
}
