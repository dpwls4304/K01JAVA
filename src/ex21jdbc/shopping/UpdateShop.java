package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{

	public UpdateShop() {
		super("kosmo", "1234");
	}
	
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(4, scanValue("수정할 상품의 일련번호"));
			csmt.setString(1, scanValue("수정할 상품명"));
			csmt.setString(2, scanValue("수정할 가격"));
			csmt.setString(3, scanValue("수정할 제품코드"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			
			csmt.execute();//쿼리실행
			
			int row = csmt.getInt(5);
			if(row==0) {
				System.out.println("해당상품이 없습니다.");
			}
			else {
				System.out.println(row + "개의 상품이 수정되었습니다.");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute();
	}

}
