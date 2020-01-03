/**
 * 
 */
package com.example.demo;

/**
 * @author rakesh.a.kumar.nayak
 *
 */
public class ProductReviewDTO {

	private long reviewId;
	private String reviewComment;
	private String reviewer;
	private long productId;
	private long ratingID;
	private int rating;
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
	/**
	 * @return the reviewComment
	 */
	public String getReviewComment() {
		return reviewComment;
	}
	/**
	 * @param reviewComment the reviewComment to set
	 */
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	/**
	 * @return the reviewer
	 */
	public String getReviewer() {
		return reviewer;
	}
	/**
	 * @param reviewer the reviewer to set
	 */
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
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
	@Override
	public String toString() {
		return "ProductReviewDTO [reviewId=" + reviewId + ", reviewComment=" + reviewComment + ", reviewer=" + reviewer
				+ ", productId=" + productId + ", ratingID=" + ratingID + ", rating=" + rating + "]";
	}
	
}
