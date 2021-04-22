package ru.myitschool.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostModel {

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    /*  @SerializedName("site")
        @Expose
        private String site;
        */
	@SerializedName("category")
    @Expose
	private String category;

    @SerializedName("name")
    @Expose
    private String name;
	
    @SerializedName("price")
    @Expose
    private String price;
	
    @SerializedName("photo")
    @Expose
    private String photo;
	
    @SerializedName("instructions")
    @Expose
    private String instructions;
	
	@SerializedName("productId")
    @Expose
	private int productId;
	
	
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * @return Site name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Site name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Site description
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price Site description
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return The link
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo The link
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return The elementPureHtml
     */
    public String getElementPureHtml() {
        return instructions;
    }

    /**
     * @param elementPureHtml The elementPureHtml
     */
    public void setElementPureHtml(String elementPureHtml) {
        this.instructions = elementPureHtml;
    }

}
