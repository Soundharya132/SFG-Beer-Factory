package web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerbyId(UUID beerId) {
		// TODO Auto-generated method stub
		//return BeerDto.Builder().newInstance().BeerId(UUID.randomUUID()).BeerName("Kingfisher").BeerType("Ale").build();
		
		return BeerDto.Builder.newInstance().setId(UUID.randomUUID()).setbeerName("Kingfisher").setbeerType("Ale").build();
	
	}
	

}
