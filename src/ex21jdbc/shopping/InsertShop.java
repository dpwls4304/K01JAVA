package ex21jdbc.shopping;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	public void execute() {
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh:mm").format(Calendar.getInstance().getTime());
		
		try {
			String sql = "INSERT INTO sh_goods VALUES ( " + 
					" goods_seq.nextval, ?, ?, sysdate , ? ) ";
			
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			int affected = psmt.executeUpdate();
			
			if(affected==0) {
				System.out.println("오류발생:입력실패");
			}
			else {
				System.out.println(affected + "행 입력");
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
		new InsertShop().execute();
	}

}
