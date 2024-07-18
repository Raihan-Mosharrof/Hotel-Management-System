package com.otu.springboothotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.otu.springboothotel.model.ProvidedService;
import com.otu.springboothotel.repository.ServiceRepository;
import java.util.List;

@Service
public class ProvidedServiceService {
    @Autowired
    private ServiceRepository ServiceRepository;

    public List<ProvidedService> getAllProvidedServices() {
        return ServiceRepository.findAll();
    }

    public ProvidedService getProvidedServiceById(int id) {
        return ServiceRepository.findById(id).orElse(null);
    }

    public ProvidedService createProvidedService(ProvidedService providedService) {
        return ServiceRepository.save(providedService);
    }

    public ProvidedService updateProvidedService(int id, ProvidedService updatedProvidedService) {
        if (ServiceRepository.existsById(id)) {
            updatedProvidedService.setId(id);
            return ServiceRepository.save(updatedProvidedService);
        }
        return null;
    }

    public void deleteProvidedService(int id) {
        ServiceRepository.deleteById(id);
    }

    // Add more methods for business logic related to ProvidedService entity
}
