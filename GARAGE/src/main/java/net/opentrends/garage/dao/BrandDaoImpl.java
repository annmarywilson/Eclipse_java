package net.opentrends.garage.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.opentrends.garage.model.Brand;
@Repository
@Transactional
public class BrandDaoImpl implements BrandDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBrand(Brand brand) {
    sessionFactory.openSession().saveOrUpdate(brand);		
	}

	@Override
	public List<Brand> getAllBrands() {
	return sessionFactory.openSession().createQuery("FROM Brand").list();
	}

	@Override
	public void deleteBrand(Integer brandID) {
        Brand brand = sessionFactory.getCurrentSession().get(Brand.class, brandID);	
        if(null!=brand){
        	this.sessionFactory.getCurrentSession().delete(brand);
        }
	}

	@Override
	public Brand updateBrand(Brand brand) {
        sessionFactory.getCurrentSession().update(brand);
		return brand;
	}

	@Override
	public Brand getBrand(int bandID) {
		return null;
	}
	
	@Override
	public Brand findByBrandId(int brandId) {
		return sessionFactory.openSession().get(Brand.class, brandId);
	}
	

}
