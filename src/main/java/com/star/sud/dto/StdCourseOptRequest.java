/**
 * 
 */
package com.star.sud.dto;

/**
 * @author Sudarshan
 *
 */
public class StdCourseOptRequest {

	private Long stdId;

	private Long courseId;

	private Long courseName;

	/**
	 * @return the stdId
	 */
	public Long getStdId() {
		return stdId;
	}

	/**
	 * @param stdId the stdId to set
	 */
	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}

	/**
	 * @return the courseId
	 */
	public Long getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public Long getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(Long courseName) {
		this.courseName = courseName;
	}

}
