
package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Phase extends Actor {

	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	endMoment;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	@NotBlank
	public void setDescription(final String description) {
		this.description = description;
	}

	@NotNull
	public Date getStartMoment() {
		return this.startMoment;
	}

	@NotNull
	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}

	@NotNull
	public Date getEndMoment() {
		return this.endMoment;
	}

	@NotNull
	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}

}
