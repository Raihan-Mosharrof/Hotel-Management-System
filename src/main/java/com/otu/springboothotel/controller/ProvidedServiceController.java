package com.otu.springboothotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.otu.springboothotel.model.ProvidedService;
import com.otu.springboothotel.service.ProvidedServiceService;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ProvidedServiceController {

    @Autowired
    private ProvidedServiceService providedServiceService;

    @GetMapping
    public ResponseEntity<List<ProvidedService>> getAllProvidedServices() {
        List<ProvidedService> providedServices = providedServiceService.getAllProvidedServices();
        return new ResponseEntity<>(providedServices, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProvidedService> getProvidedServiceById(@PathVariable("id") int id) {
        ProvidedService providedService = providedServiceService.getProvidedServiceById(id);
        if (providedService != null) {
            return new ResponseEntity<>(providedService, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProvidedService> createProvidedService(@RequestBody ProvidedService providedService) {
        ProvidedService createdService = providedServiceService.createProvidedService(providedService);
        return new ResponseEntity<>(createdService, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProvidedService> updateProvidedService(@PathVariable("id") int id, @RequestBody ProvidedService updatedService) {
        ProvidedService service = providedServiceService.updateProvidedService(id, updatedService);
        if (service != null) {
            return new ResponseEntity<>(service, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvidedService(@PathVariable("id") int id) {
        providedServiceService.deleteProvidedService(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
