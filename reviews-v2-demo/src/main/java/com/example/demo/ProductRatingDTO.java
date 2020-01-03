/**
 * 
 */
package com.example.demo;

/**
 * @author rakesh.a.kumar.nayak
 *
 */
public class ProductRatingDTO {

	private long ratingID;
	private int rating;
	private long productId;
	private long reviewId;
	/**
	 * @return the ratingID
	 */
	public long getRatingID() {
		return ratingID;
	}
	/**
	 * @param ratingID the ratingID to set
	 */
	public void setRatingID(long ratingID) {
		this.ratingID = ratingID;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	/**
	 * @return the reviewId
	 */
	public long getReviewId() {
		return reviewId;
	}
	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	@Override
	public String toString() {
		return "ProductRatingDTO [ratingID=" + ratingID + ", rating=" + rating + ", productId=" + productId
				+ ", reviewId=" + reviewId + "]";
	}
	
	
	
}
