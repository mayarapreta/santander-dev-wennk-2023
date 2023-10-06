package me.dio.domain.model;

import java.util.List;

import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity(name ="tb_user")

public class User {

	@ID 
	@GeneratedValue(GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Accont account;
	@OneToOne(cascade = CascadeType.ALL)
	private Card card;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = fetchType.EAGER)
	private List<Feature> features;
	
	@OneToMany(cascade = CascadeType.ALL,  fetch = fecthType.EAGER)
	private  List<News> news;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Accont getAccount() {
		return account;
	}
	public void setAccount(Accont account) {
		this.account = account;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	
	
	
}
