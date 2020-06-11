package ex21jdbc.callable;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl {
	
	public DeleteShop() {
		super("kosmo", "1234");
	}
	
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?, ?)}");
			
			csmt.setString(1, scanValue("삭제할 상품의 일련번호"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			
			csmt.execute();
			
			int row = csmt.getInt(2);
			
			if(row==0) {
				System.out.println("삭제할 상품이 존재하지 않습니다.");
			}
			else {
				System.out.println(row + "행이 삭제되었습니다.");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DeleteShop().execute();
	}

}
