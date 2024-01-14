package Selenium;

public class ThisKeyword {
	int x,y;
	void assign(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.assign(10, 20);
		tk.display();
		
	}

}
