package web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.model.BeerDto;
import web.service.BeerService;

@RequestMapping(value="/api/v1/beer")
@RestController
public class BeerController {
	
	
	@Autowired
	private final BeerService beerService;
	
	
	public BeerController(BeerService beerService) {
				this.beerService = beerService;
	}

	@GetMapping("/hi")
	public String hif() {
		
		return "hi";
	}

	@GetMapping(value={"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		//System.out.println(beerService.getBeerbyId(beerId));
		return new ResponseEntity(beerService.getBeerbyId(beerId),HttpStatus.OK);
	}

	
	
	
	

	
	
	
}
