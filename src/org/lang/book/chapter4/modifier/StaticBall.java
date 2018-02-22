package org.lang.book.chapter4.modifier;

/**
 * 展示静态变量的存储方式。
 * 
 * @author chenjunfeng1
 *
 */
public class StaticBall {
	//记录当前总共创建了多少个ball
    public static int seqNum;
    
    private float weight;
    private float width;
    private float height;
    
    public StaticBall() {
    	seqNum++;
    }
    
    public StaticBall(float weight, float height, float width) {
    	seqNum++;  //每次调用构造方法，seqNum自增1
    	
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
		StaticBall basketBall = new StaticBall(2.0f, 25.2f, 25.2f);
		StaticBall footBall = new StaticBall(1.5f, 20.2f, 20.2f);

		System.out.println("BasketBall seqNum:" + basketBall.seqNum);
		System.out.println("FootBall seqNum:" + footBall.seqNum);
		System.out.println("StaticBall seqNum:" + StaticBall.seqNum);
	}
}
