package VariablesDemo;

public class mianclass {

	public static void main(String[] args) {

		GlobalVar gv = new GlobalVar();
		gv.show();
		
		
		// This is for multiple Constructor........//
		
		Conustractor ct = new Conustractor(1,80.40);
		ct.show();
		
		Conustractor ct1 = new Conustractor(2,90.50);
		ct1.show();
		
		Conustractor ct2 = new Conustractor(3,70.50);
		ct2.show();
		
		Conustractor ct3 = new Conustractor(4,60.50);
		ct3.show();
		
		Conustractor ct4 = new Conustractor(5,50.50);
		ct4.show();
	}

}
