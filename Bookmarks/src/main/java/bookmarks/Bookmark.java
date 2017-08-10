package bookmarks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookmark {

	@ManyToOne
	@JsonIgnore
	private Account account;

	@Id
	@GeneratedValue
	private Long id;

	public String uri;
	public String description;

	public Bookmark() {

	}

	/**
	 * @param account
	 * @param uri
	 * @param description
	 */
	public Bookmark(Account account, String uri, String description) {
		this.account = account;
		this.uri = uri;
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public Long getId() {
		return id;
	}

	public String getUri() {
		return uri;
	}

	public String getDescription() {
		return description;
	}

}
