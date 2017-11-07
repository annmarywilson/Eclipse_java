package net.opentrends.garage.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.opentrends.garage.dao.BrandDAO;
import net.opentrends.garage.dto.BrandDTO;
import net.opentrends.garage.model.Brand;
@Service
@Transactional
public class BrandServiceImpl implements BrandService{
    @Autowired
	private BrandDAO brandDao;
	@Override
	@Transactional
	public void addBrand(Brand brand) {
    brandDao.addBrand(brand);		
	}

	@Override
	@Transactional
	public List<BrandDTO> getAllBrands() {
		List<BrandDTO> dtoList = null;
		BrandDTO brandDTO = null;
		List<Brand> brands = brandDao.getAllBrands();
		if(brands != null && !brands.isEmpty()) {
			dtoList = new ArrayList<BrandDTO>();
			for (Brand brand : brands) {
				brandDTO = new BrandDTO();
				BeanUtils.copyProperties(brand, brandDTO);
				dtoList.add(brandDTO);
			}
		}
		return dtoList;
	}

	@Override
	@Transactional
	public void deleteBrand(Integer brandID) {
         brandDao.deleteBrand(brandID);		
	}

	@Override
	public Brand updateBrand(Brand brand) {
		return brandDao.updateBrand(brand);
	}

	@Override
	public Brand getBrand(int bandID) {
		return brandDao.getBrand(bandID);
	}
	
	public void setBrandDao(BrandDAO brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public List<Brand> modellist() {
		return brandDao.getAllBrands();
	}

}
