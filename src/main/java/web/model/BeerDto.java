package web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

final public class BeerDto {
	
	private UUID id;
	private String beerName;
	private String beerType;
	private long Upc;
	
	public BeerDto() {}
	public BeerDto(Builder builder) 
	{
		
		this.id = builder.id;
		this.beerName = builder.beerName;
		this.beerType = builder.beerType;
		
	}
	
	public static class Builder{
		private UUID id;
		private String beerName;
		private String beerType;
		private long Upc;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		private Builder() {}
		
		public Builder setId(UUID id) {
			this.id=id;
			return this;
		}
		public Builder setbeerName(String beerName) {
			this.beerName=beerName;
			return this;
		}
		public Builder setbeerType(String beerType) {
			this.beerType=beerType;
			return this;
		}
		public BeerDto build() {
			return new BeerDto(this);
		}
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBeerType() {
		return beerType;
	}
	public void setBeerType(String beerType) {
		this.beerType = beerType;
	}
	public long getUpc() {
		return Upc;
	}
	public void setUpc(long upc) {
		Upc = upc;
	}
	@Override
	public String toString() {
		return "BeerDto [id=" + id + ", beerName=" + beerName + ", beerType=" + beerType + ", Upc=" + Upc + "]";
	}
	
	
}
