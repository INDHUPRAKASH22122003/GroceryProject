package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Grocerylist")
public class model {
 
		@Id
		private int sno;
		private String itemName;
		private String category;
		private int quantity;
		private float price;
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public model(int sno, String itemName, String category, int quantity, float price) {
			super();
			this.sno = sno;
			this.itemName = itemName;
			this.category = category;
			this.quantity = quantity;
			this.price = price;
		}
		public model() {
			
		}
		public String toString() {
			return "SerialNo="+sno+"ItemName="+itemName+"Category="+category+"Quantity="+quantity+"Price="+price;
		}	
}
