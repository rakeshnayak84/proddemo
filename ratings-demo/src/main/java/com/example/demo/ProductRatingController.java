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
public class ProductRatingController {
	
		
	@RequestMapping(value = "/productRating/{productId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ProductRatingDTO> getProductRatings(
			@PathVariable("productId") long productId) {
		
		List<ProductRatingDTO> productRatings = new ArrayList<ProductRatingDTO>();
		
			try {
				productRatings = fetchProductRatings(productId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productRatings;
	}
	
	@RequestMapping(value = "/reviewRating/{reviewId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ProductRatingDTO getReviewRating(
			@PathVariable("reviewId") long reviewId) {
		
		ProductRatingDTO productRatingDto = new ProductRatingDTO();
		
			try {
				productRatingDto = fetchReviewRating(reviewId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productRatingDto;
	}
	
	List<ProductRatingDTO> fetchProductRatings(long productId){
		
		List<ProductRatingDTO> productRatings = new ArrayList<ProductRatingDTO>();
		
		if(productId == 100) {
			ProductRatingDTO productRatingDTO = new ProductRatingDTO();
			productRatingDTO.setRatingID(300);
			productRatingDTO.setRating(5);
			productRatingDTO.setProductId(productId);
			productRatingDTO.setReviewId(1);
			productRatings.add(productRatingDTO);
			
			ProductRatingDTO productRatingDTO2 = new ProductRatingDTO();
			productRatingDTO2.setRatingID(301);
			productRatingDTO2.setRating(4);
			productRatingDTO2.setProductId(productId);
			productRatingDTO2.setReviewId(2);
			productRatings.add(productRatingDTO2);
			
			ProductRatingDTO productRatingDTO3 = new ProductRatingDTO();
			productRatingDTO3.setRatingID(302);
			productRatingDTO3.setRating(2);
			productRatingDTO3.setProductId(productId);
			productRatingDTO3.setReviewId(3);
			productRatings.add(productRatingDTO3);
		}
		else if(productId == 101) {
			ProductRatingDTO productRatingDTO = new ProductRatingDTO();
			productRatingDTO.setRatingID(303);
			productRatingDTO.setRating(5);
			productRatingDTO.setProductId(productId);
			productRatingDTO.setReviewId(4);
			productRatings.add(productRatingDTO);
			
			ProductRatingDTO productRatingDTO2 = new ProductRatingDTO();
			productRatingDTO2.setRatingID(304);
			productRatingDTO2.setRating(3);
			productRatingDTO2.setProductId(productId);
			productRatingDTO2.setReviewId(5);
			productRatings.add(productRatingDTO2);
		}
		else if(productId == 102) {
			ProductRatingDTO productRatingDTO = new ProductRatingDTO();
			productRatingDTO.setRatingID(305);
			productRatingDTO.setRating(4);
			productRatingDTO.setProductId(productId);
			productRatingDTO.setReviewId(6);
			productRatings.add(productRatingDTO);
		}
		
		return productRatings;
	}
	
	ProductRatingDTO fetchReviewRating(long reviewId) {
		ProductRatingDTO productRatingDTO = new ProductRatingDTO();
		
		if(reviewId == 1) {
			productRatingDTO.setRatingID(300);
			productRatingDTO.setRating(5);
			productRatingDTO.setProductId(100);
			productRatingDTO.setReviewId(1);
		}
		else if(reviewId == 2) {
			productRatingDTO.setRatingID(301);
			productRatingDTO.setRating(4);
			productRatingDTO.setProductId(100);
			productRatingDTO.setReviewId(2);
		}
		else if(reviewId == 3) {
			productRatingDTO.setRatingID(302);
			productRatingDTO.setRating(2);
			productRatingDTO.setProductId(100);
			productRatingDTO.setReviewId(3);
		}
		else if(reviewId == 4) {
			productRatingDTO.setRatingID(303);
			productRatingDTO.setRating(5);
			productRatingDTO.setProductId(101);
			productRatingDTO.setReviewId(4);
		}
		else if(reviewId == 5) {
			productRatingDTO.setRatingID(304);
			productRatingDTO.setRating(3);
			productRatingDTO.setProductId(101);
			productRatingDTO.setReviewId(5);
		}
		else if(reviewId == 6) {
			productRatingDTO.setRatingID(305);
			productRatingDTO.setRating(4);
			productRatingDTO.setProductId(102);
			productRatingDTO.setReviewId(6);
		}
		
		
		return productRatingDTO;
	}
	
}
