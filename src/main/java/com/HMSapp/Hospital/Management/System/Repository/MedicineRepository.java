package com.HMSapp.Hospital.Management.System.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMSapp.Hospital.Management.System.Entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
