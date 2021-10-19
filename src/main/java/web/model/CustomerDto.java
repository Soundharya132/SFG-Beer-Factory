package web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDto {

	private UUID customerId;
	private String customerName;
	
	private CustomerDto() {}
	
	private CustomerDto(Builder builder) {
		this.customerId=builder.customerId;
		this.customerName=builder.customerName;
	}
	
	public static class Builder {
		private UUID customerId;
		private String customerName;
		
		private Builder() {}
		
		public Builder setCustomerId(UUID customerId) {
			this.customerId=customerId;
			return this;
		}
		
		public Builder setCustomerName(String customerName) {
			this.customerName=customerName;
			return this;
		}
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public CustomerDto build() {
			return new CustomerDto(this);
		}
		
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
	
}
