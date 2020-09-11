package com.webblog.model;

import org.springframework.web.multipart.MultipartFile;

public class Post {
		private int id;
		private String name;
		private String description;
		private String date;
		private String image;
		private MultipartFile multipartFile;
		private User user;
		private Category category;
		
		
		
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

		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
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
		public MultipartFile getMultipartFile() {
			return multipartFile;
		}
		public void setMultipartFile(MultipartFile multipartFile) {
			this.multipartFile = multipartFile;
		}
		
		
}
