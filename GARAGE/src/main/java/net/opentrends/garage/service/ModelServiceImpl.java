package net.opentrends.garage.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.opentrends.garage.dao.ModelDAO;
import net.opentrends.garage.dto.BrandDTO;
import net.opentrends.garage.dto.ModelDTO;
import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.model.Brand;
import net.opentrends.garage.model.Model;
@Service
@Transactional
public class ModelServiceImpl implements ModelService{
    @Autowired
	private ModelDAO modelDao;
    @Autowired
    private ModelService modelService;
	@Override
	@Transactional
	public void addModel(Model model) {
      modelDao.addModel(model);		
	}

	@Override
	@Transactional
	public List<ModelDTO> getAllModels() {
		List<ModelDTO> dtoList = null;
		ModelDTO modelDTO = null;
		List<Model> models = modelDao.getAllModel();
		if(models != null && !models.isEmpty()) {
			dtoList = new ArrayList<ModelDTO>();
			for (Model model : models) {
				modelDTO = new ModelDTO();
				BeanUtils.copyProperties(model, modelDTO);
				dtoList.add(modelDTO);
			}
		
	    }
		return dtoList;
		}

	@Override
	@Transactional
	public void deleteModel(Integer modelID) {
      modelDao.deleteModel(modelID);		
	}

	@Override
	public Model updateModel(Model model) {
		return modelDao.updateModel(model);
	}

	@Override
	public Model getModel(int modelID) {
		return modelDao.getModel(modelID);
	}

	public void setModelDao(ModelDAO modelDao) {
		this.modelDao = modelDao;
	}

	@Override
	public void addModel(VehicleDto vehicle) {
		this.modelDao.addVehicle(vehicle);
	}

	@Override
	public List getModelListById(int brandId) {
		return this.modelDao.getModelListById(brandId);
	}

}
