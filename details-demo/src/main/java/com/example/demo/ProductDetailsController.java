/**
 * 
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rakesh.a.kumar.nayak
 *
 */
@RestController
public class ProductDetailsController {
	
		
	@RequestMapping(value = "/details/{productId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ProductDetailsDTO getProductDetails(
			@PathVariable("productId") long productId) {
		
		ProductDetailsDTO productDetailsDTO = null;
		
			try {
				productDetailsDTO = fetchProductDetails(productId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productDetailsDTO;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ProductDetailsDTO> getAllProducts() {
		
		List<ProductDetailsDTO> productDetailsDTOList = new ArrayList<ProductDetailsDTO>();
		
			try {
				productDetailsDTOList = fetchAllProducts();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productDetailsDTOList;
	}
	
	ProductDetailsDTO fetchProductDetails (long productId){
		ProductDetailsDTO productDetailsDTO = new ProductDetailsDTO();
		
		if(productId == 100) {
			productDetailsDTO.setProductId(productId);
			productDetailsDTO.setCategory("electronics");
			productDetailsDTO.setDescription("laptop");
			productDetailsDTO.setPrice(96000);
			productDetailsDTO.setProductName("hp elitebook");
		}
		else if(productId == 101) {
			productDetailsDTO.setProductId(productId);
			productDetailsDTO.setCategory("fashion");
			productDetailsDTO.setDescription("jeans pant");
			productDetailsDTO.setPrice(3400);
			productDetailsDTO.setProductName("Killer Jeans");
		}
		else if(productId == 102) {
			productDetailsDTO.setProductId(productId);
			productDetailsDTO.setCategory("kids");
			productDetailsDTO.setDescription("toys");
			productDetailsDTO.setPrice(1400);
			productDetailsDTO.setProductName("Automatic Toy Train");
		}
		
		return productDetailsDTO;
	}
	
	List<ProductDetailsDTO> fetchAllProducts(){
		List<ProductDetailsDTO> productDetailsDTOList = new ArrayList<ProductDetailsDTO>();
		
		ProductDetailsDTO productDetailsDTO1 = new ProductDetailsDTO();
		productDetailsDTO1.setProductId(100);
		productDetailsDTO1.setCategory("electronics");
		productDetailsDTO1.setDescription("laptop");
		productDetailsDTO1.setPrice(96000);
		productDetailsDTO1.setProductName("hp elitebook");
		productDetailsDTOList.add(productDetailsDTO1);
		
		ProductDetailsDTO productDetailsDTO2 = new ProductDetailsDTO();
		productDetailsDTO2.setProductId(101);
		productDetailsDTO2.setCategory("fashion");
		productDetailsDTO2.setDescription("jeans pant");
		productDetailsDTO2.setPrice(3400);
		productDetailsDTO2.setProductName("Killer Jeans");
		productDetailsDTOList.add(productDetailsDTO2);
		
		ProductDetailsDTO productDetailsDTO3 = new ProductDetailsDTO();
		productDetailsDTO3.setProductId(102);
		productDetailsDTO3.setCategory("kids");
		productDetailsDTO3.setDescription("toys");
		productDetailsDTO3.setPrice(1400);
		productDetailsDTO3.setProductName("Automatic Toy Train");
		productDetailsDTOList.add(productDetailsDTO3);
		
		return productDetailsDTOList;		
	}

}
