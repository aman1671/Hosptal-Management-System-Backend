package com.HMSapp.Hospital.Management.System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMSapp.Hospital.Management.System.DTO.MedicineDTO;
import com.HMSapp.Hospital.Management.System.Entity.Medicine;
import com.HMSapp.Hospital.Management.System.Repository.MedicineRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Optional<Medicine> getMedicineById(Long id) {
        return medicineRepository.findById(id);
    }

    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
    
    public Optional<Medicine> updateMedicine(Long id, MedicineDTO medicineDTO) {
        return medicineRepository.findById(id).map(medicine -> {
            medicine.setdrugname(medicineDTO.getdrugname());
            medicine.setStock(medicineDTO.getStock());
            return medicineRepository.save(medicine);
        });
    }

    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }
}
