package com.webblog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name = "news")
public class PostEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String description;
		private String date;
		private String image;
		@OneToOne
		@JoinColumn(name = "userid")
		private UserEntity user;
		@ManyToOne
		@JoinColumn(name="categoryid")
		private CategoryEntity category;
		
		@OneToOne(mappedBy = "post")
		private VoteEntity voteEntity;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}

		public UserEntity getUser() {
			return user;
		}
		public void setUser(UserEntity user) {
			this.user = user;
		}
		public CategoryEntity getCategory() {
			return category;
		}
		public void setCategory(CategoryEntity category) {
			this.category = category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		
		
		
}
