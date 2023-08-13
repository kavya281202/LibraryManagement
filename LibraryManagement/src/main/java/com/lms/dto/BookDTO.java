package com.lms.dto;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.Builder;
import lombok.NoArgsConstructor;

//	@Data
	@Builder
	@NoArgsConstructor
	

	public class BookDTO {

		private int id;
		
		@NotBlank (message = "Empty Not Allowed")
		@NotNull(message = "Name Of the Book Is Not Null")
		@Size(min = 3, max = 10, message = "Name must be within 3-10 characters")
		private String bookName;
		@NotBlank(message = "Empty Not Allowed")
		private String publisher;
		private String author;
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}

}