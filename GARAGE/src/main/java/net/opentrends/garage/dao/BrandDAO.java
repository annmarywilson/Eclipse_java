package net.opentrends.garage.dao;

import java.util.List;

import net.opentrends.garage.model.Brand;

public interface BrandDAO {
	public void addBrand(Brand brand);
	public List<Brand> getAllBrands();
	public void deleteBrand(Integer brandID);
	public Brand updateBrand(Brand brand);
	public Brand getBrand(int bandID);
	public Brand findByBrandId(int brandId);
    }
