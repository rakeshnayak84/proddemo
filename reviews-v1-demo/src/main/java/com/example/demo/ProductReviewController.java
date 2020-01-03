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
public class ProductReviewController {
	
	
	@RequestMapping(value = "/reviews/{productId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ProductReviewDTO> getProductReviews(
			@PathVariable("productId") long productId) {
		
		List<ProductReviewDTO> productReviews = new ArrayList<ProductReviewDTO>();
		
			try {
				productReviews = fetchProductReviews(productId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productReviews;
	}	
	
	List<ProductReviewDTO> fetchProductReviews(long productId){
		List<ProductReviewDTO> productReviews = new ArrayList<ProductReviewDTO>();
		
		if(productId == 100) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(1);
			productReviewDTO.setReviewComment("very nice laptop");
			productReviewDTO.setReviewer("user1");
			productReviewDTO.setProductId(100);
			productReviews.add(productReviewDTO);
			
			ProductReviewDTO productReviewDTO2 = new ProductReviewDTO();
			productReviewDTO2.setReviewId(2);
			productReviewDTO2.setReviewComment("processing is very fast");
			productReviewDTO2.setReviewer("user2");
			productReviewDTO2.setProductId(100);
			productReviews.add(productReviewDTO2);
			
			ProductReviewDTO productReviewDTO3 = new ProductReviewDTO();
			productReviewDTO3.setReviewId(3);
			productReviewDTO3.setReviewComment("picture quality not so good");
			productReviewDTO3.setReviewer("user3");
			productReviewDTO3.setProductId(100);
			productReviews.add(productReviewDTO3);
		}
		else if(productId == 101) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(4);
			productReviewDTO.setReviewComment("jeans quality better than expected");
			productReviewDTO.setReviewer("user4");
			productReviewDTO.setProductId(101);
			productReviews.add(productReviewDTO);
			
			ProductReviewDTO productReviewDTO2 = new ProductReviewDTO();
			productReviewDTO2.setReviewId(5);
			productReviewDTO2.setReviewComment("so stylish, very nice looking");
			productReviewDTO2.setReviewer("user5");
			productReviewDTO2.setProductId(101);
			productReviews.add(productReviewDTO2);
		}
		else if(productId == 102) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(6);
			productReviewDTO.setReviewComment("The quality of toy train is better than expected");
			productReviewDTO.setReviewer("user6");
			productReviewDTO.setProductId(102);
			productReviews.add(productReviewDTO);
		}
		
		return productReviews;
	}
	
	
}
