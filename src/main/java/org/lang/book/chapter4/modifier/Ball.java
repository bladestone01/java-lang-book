package org.lang.book.chapter4.modifier;

/**
 * 展示变量的存储方式.
 * 
 * @author chenjunfeng1
 *
 */
public class Ball {
    private float weight;
    private float width;
    private float height;
    
    public Ball() {
    	
    }
    
    public Ball(float weight, float height, float width) {
    	this.weight = weight;
    	this.height = height;
    	this.width = width;
    }
    
	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public static void main(String[] args) {
		Ball basketBall = new Ball(2.0f, 25.2f, 25.2f);
        Ball footBall = new Ball(1.5f, 20.2f, 20.2f);
        
        System.out.println("BasketBall Weight:" + basketBall.getWeight());
        System.out.println("Footall Weight:" + basketBall.getWeight());
	}

}
