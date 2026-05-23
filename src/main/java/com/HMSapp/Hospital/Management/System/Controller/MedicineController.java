package com.HMSapp.Hospital.Management.System.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.HMSapp.Hospital.Management.System.DTO.MedicineDTO;
import com.HMSapp.Hospital.Management.System.Entity.Medicine;
import com.HMSapp.Hospital.Management.System.Service.MedicineService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicines")

@CrossOrigin("http://localhost:4200/")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable Long id) {
        Optional<Medicine> medicine = medicineService.getMedicineById(id);
        return medicine.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        return medicineService.addMedicine(medicine);
    }
    
    @PutMapping("/{id}")
    public Optional<Medicine> updateMedicine(@PathVariable Long id, @RequestBody MedicineDTO medicineDTO) {
        return medicineService.updateMedicine(id, medicineDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
        return ResponseEntity.noContent().build();
    }
}
