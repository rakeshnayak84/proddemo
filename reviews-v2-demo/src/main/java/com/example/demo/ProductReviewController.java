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
import org.springframework.web.client.RestTemplate;

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
				productReviews = fetchtProductReviews(productId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productReviews;
	}	
	
	List<ProductReviewDTO> fetchtProductReviews(long productId){
		List<ProductReviewDTO> productReviewDtoList = new ArrayList<ProductReviewDTO>();
		
		RestTemplate restTemplate = new RestTemplate();
		final String ratingByreviewIdSvcUri = "http://ratings:8080/reviewRating/";
		
		if(productId == 100) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(1);
			productReviewDTO.setReviewComment("very nice laptop");
			productReviewDTO.setReviewer("user1");
			productReviewDTO.setProductId(100);			
			ProductRatingDTO productRatingDTO = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO);			
			productReviewDTO.setRatingID(productRatingDTO.getRatingID());
			productReviewDTO.setRating(productRatingDTO.getRating());			
			productReviewDtoList.add(productReviewDTO);
			
			ProductReviewDTO productReviewDTO2 = new ProductReviewDTO();
			productReviewDTO2.setReviewId(2);
			productReviewDTO2.setReviewComment("processing is very fast");
			productReviewDTO2.setReviewer("user2");
			productReviewDTO2.setProductId(100);
			ProductRatingDTO productRatingDTO2 = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO2.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO2);			
			productReviewDTO2.setRatingID(productRatingDTO2.getRatingID());
			productReviewDTO2.setRating(productRatingDTO2.getRating());			
			productReviewDtoList.add(productReviewDTO2);
			
			ProductReviewDTO productReviewDTO3 = new ProductReviewDTO();
			productReviewDTO3.setReviewId(3);
			productReviewDTO3.setReviewComment("picture quality not so good");
			productReviewDTO3.setReviewer("user3");
			productReviewDTO3.setProductId(100);
			ProductRatingDTO productRatingDTO3 = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO3.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO3);			
			productReviewDTO3.setRatingID(productRatingDTO3.getRatingID());
			productReviewDTO3.setRating(productRatingDTO3.getRating());			
			productReviewDtoList.add(productReviewDTO3);
			
		}
		else if(productId == 101) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(4);
			productReviewDTO.setReviewComment("jeans quality better than expected");
			productReviewDTO.setReviewer("user4");
			productReviewDTO.setProductId(101);
			ProductRatingDTO productRatingDTO = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO);			
			productReviewDTO.setRatingID(productRatingDTO.getRatingID());
			productReviewDTO.setRating(productRatingDTO.getRating());	
			productReviewDtoList.add(productReviewDTO);
			
			ProductReviewDTO productReviewDTO2 = new ProductReviewDTO();
			productReviewDTO2.setReviewId(5);
			productReviewDTO2.setReviewComment("so stylish, very nice looking");
			productReviewDTO2.setReviewer("user5");
			productReviewDTO2.setProductId(101);
			ProductRatingDTO productRatingDTO2 = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO2.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO2);			
			productReviewDTO2.setRatingID(productRatingDTO2.getRatingID());
			productReviewDTO2.setRating(productRatingDTO2.getRating());		
			productReviewDtoList.add(productReviewDTO2);
		}
		else if(productId == 102) {
			ProductReviewDTO productReviewDTO = new ProductReviewDTO();
			productReviewDTO.setReviewId(6);
			productReviewDTO.setReviewComment("The quality of toy train is better than expected");
			productReviewDTO.setReviewer("user6");
			productReviewDTO.setProductId(102);
			ProductRatingDTO productRatingDTO = restTemplate.getForObject(ratingByreviewIdSvcUri+productReviewDTO.getReviewId(), ProductRatingDTO.class);			
			System.out.println("productRatingDTO=="+productRatingDTO);			
			productReviewDTO.setRatingID(productRatingDTO.getRatingID());
			productReviewDTO.setRating(productRatingDTO.getRating());	
			productReviewDtoList.add(productReviewDTO);
		}
		
		
		
		return productReviewDtoList;
	}
	
}
