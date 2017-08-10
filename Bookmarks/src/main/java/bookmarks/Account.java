package bookmarks;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<>();

	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnore
	private String password;
	private String username;

	public Account() {

	}

	public Account(String password, String username) {
		this.password = password;
		this.username = username;
	}

	public Set<Bookmark> getBookmarks() {
		return bookmarks;
	}

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

}
