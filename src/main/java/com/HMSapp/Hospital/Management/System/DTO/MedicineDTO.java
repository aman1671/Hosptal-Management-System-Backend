package com.HMSapp.Hospital.Management.System.DTO;

public class MedicineDTO {

    private Long id;           
    private String drugname;   
    private int stock;        

    public MedicineDTO() {}


    public MedicineDTO(Long id, String drugname, int stock) {
        this.id = id;
        this.drugname = drugname;
        this.stock = stock;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getdrugname() {
        return drugname;
    }

    public void setdrugname(String drugname) {
        this.drugname = drugname;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
