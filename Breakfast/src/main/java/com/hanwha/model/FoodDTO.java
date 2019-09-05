package com.hanwha.model;

public class FoodDTO {
		private int itemnumber;
		private String item;
		String pic;
		
		public int getItemnumber() {
			return itemnumber;
		}
		public void setItemnumber(int itemnumber) {
			this.itemnumber = itemnumber;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public FoodDTO(int itemnumber, String item) {
			super();
			this.itemnumber = itemnumber;
			this.item = item;
		}
		
		
		
		public String getPic() {
			return pic;
		}
		public void setPic(String pic) {
			this.pic = pic;
		}
		public FoodDTO() {};

}
