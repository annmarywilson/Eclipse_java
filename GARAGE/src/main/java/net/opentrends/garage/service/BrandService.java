package net.opentrends.garage.service;

import java.util.List;

import net.opentrends.garage.dto.BrandDTO;
import net.opentrends.garage.model.Brand;

    public interface BrandService {

    	public void addBrand(Brand brand);
    	public List<BrandDTO> getAllBrands();
    	public void deleteBrand(Integer brandID);
    	public Brand updateBrand(Brand brand);
    	public Brand getBrand(int bandID);
    	public List<Brand> modellist();
}
