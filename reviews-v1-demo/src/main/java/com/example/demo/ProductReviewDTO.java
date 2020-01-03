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
	
}
