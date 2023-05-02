package com.examly.springapp.Model;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;



	@Entity
	public class Gift {

		@Id
		// @GeneratedValue(strategy = GenerationType.AUTO)
		int giftId;
		String giftName;
		String giftDetails;
		String giftimageUrl;
		int giftPrice;
		 @OneToOne(targetEntity=Theme.class,cascade = CascadeType.ALL)
		 @JoinColumn(referencedColumnName="themeId")
		 private Theme theme; 
		 


		public Theme getTheme() {
			return theme;
		}
		public void setTheme(Theme theme) {
			this.theme = theme;
		}
		public int getGiftId() {
			return giftId;
		}
		public void setGiftId(int giftId) {
			this.giftId = giftId;
		}
		public String getGiftName() {
			return giftName;
		}
		public void setGiftName(String giftName) {
			this.giftName = giftName;
		}

		public String getGiftDetails() {
			return giftDetails;
		}
		public void setGiftDetails(String giftDetails) {
			this.giftDetails = giftDetails;
		}
		public String getGiftimageUrl() {
			return giftimageUrl;
		}
		public void setGiftimageUrl(String giftImageUrl) {
			this.giftimageUrl=giftImageUrl;
		}
		public int getGiftPrice() {
			return giftPrice;
		}
		public void setGiftPrice(int giftPrice) {
			this.giftPrice = giftPrice;
		}

			


		public Gift(int giftId, String giftName, String giftDetails, int giftPrice,
				Theme theme, String giftimageUrl) {
			super();
			this.giftId = giftId;
			this.giftName = giftName;
			this.giftDetails = giftDetails;
			this.giftimageUrl=giftimageUrl;
			this.giftPrice = giftPrice;
			this.theme = theme;
		}


		@Override
		public String toString() {
			return "Gift [giftId=" + giftId + ", giftName=" + giftName + ", giftDetails="
					+ giftDetails + ", giftimageUrl=" +giftimageUrl + ",giftPrice=" + giftPrice + ", theme=" + theme + "]";
		}
		public Gift() {
			super();
		}
		/*
		 * @ManyToOne(fetch=FetchType.LAZY)
		 * 
		 * @JoinColumn(name="Theme_Id") private Theme theme;
		 */
		 

		}



