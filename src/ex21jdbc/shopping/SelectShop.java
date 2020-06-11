package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl {
	
	public SelectShop() {
		super("kosmo", "1234");
	}
	
	
	public void execute() {
		try {
			String name = scanValue("상품명");
			
			String sql = "SELECT g_idx, goods_name,"
					+ " ltrim(to_char(goods_price, '999,999,999')),"
					+ " to_char(regidate, 'yyyy-MM-dd hh:mi'), p_code"
					+ " FROM sh_goods"
					+ " WHERE goods_name like '%"+name+"%'";
			
			psmt = con.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				String idx = rs.getString(1);
				String pname = rs.getString(2);
				String price = rs.getString(3);
				String regidate = rs.getString(4);
				String code = rs.getString(5);
				
				System.out.println();
				System.out.println("일련번호:" + idx);
				System.out.println("상품명:" + pname);
				System.out.println("가격:" + price);
				System.out.println("등록일:" + regidate);
				System.out.println("제품코드:" + code);
			}
			else {
				System.out.println("결과없음");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SelectShop().execute();
	}

}
