/*
+=====================================+
|       Name: Wan FuRin               |
| StudentNum: 316541                  |
+=====================================+
*/
import java.sql.SQLException;
import java.util.Hashtable;
public class ExtendedBank {
    private DBtable customer; /* 口座リスト */
    public ExtendedBank() {  /* 口座リストを初期化する */
    customer = new DBtable();
    // 必要な処理があれば追加する
    } 
    public int login(String name,String password) {
    	Account account =customer.get(name);
    	if(customer.get(name)==null) {
    		return -7;
    	}
    	if(password.equals(account.getPassword())) {
    		return 0;
    	}else {
    		return -8;
    	}
    }
    public int open(String name ,String password,String comfirmPassword/* 口座名 */) {
    	if(customer.get(name)==null) {
    		if(password.equals(comfirmPassword)) {
        		Account account= new Account(name,0,password);
        		try {
    				customer.put(name, account);
    			} catch (ClassNotFoundException | SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            	return 0;
    		}else {
    			return -3;
    		}
    	}
    		return -7;

    } /* 口座開設 */
    public int close(String name /* 口座名 */) {
    	if(customer.get(name)==null) {
    		return -7;
    	}
    	if(customer.get(name).showBalance()==0) {
    		customer.remove(name);
    		return 0;
    	}else {
    		return -1;
    	}
    	
    } /* 口座解約 */
    public int deposit(String name /* 口座名 */, int amount /* 預金額 */) {
    	Account account = customer.get(name);
    	if(account==null) {
    		return -7;
    	}else {
    		int result=account.deposit(amount);
    		if(result==0) {
    			try {
					customer.put(name, account);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		return result;
    	}
    } /* 預金 */
    public int withdraw(String name /* 口座名 */, int amount /* 引き出し額 */) { 
    	Account account = customer.get(name);
    	if(account==null) {
    		return -7;
    	}else {
    		int result=account.withdraw(amount);
    		if(result==0) {
    			try {
					customer.put(name, account);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		return result;
    	}
    } /* 払い戻し*/
    public int showBalance(String name /* 口座名 */) {     	
    	if(customer.get(name)==null) {
    		return -7;
    	}else {
    		return customer.get(name).showBalance();
    	}
    } /* 残高照会 */
    public int deposit(String name, String amount) {
    	if(!isNumeric(amount))return -4;
    	double tmpd=Double.valueOf(amount);
    	if((tmpd*10)%10==0) {
    		int tmpi=Integer.valueOf(amount);
    		return this.deposit(name,tmpi);
    	}else {
    		return -4;
    	}
    }
    public int withdraw(String name, String amount) {
    	if(!isNumeric(amount))return -4;
    	double tmpd=Double.valueOf(amount);
    	if((tmpd*10)%10==0) {
    		int tmpi=Integer.valueOf(amount);
    		return this.withdraw(name,tmpi);	
    	}else {
    		return -4;
    	}
    }
    public int setPassword(String name,String newPassword) {
    	Account account = customer.get(name);
    	if(account==null) {
    		return -7;
    	}else {
    		account.setPassword(newPassword);
    		try {
				customer.put(name, account);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		return 0;
    	}
    }
    private boolean isNumeric(String str) {
    	if (str == null) return false;
        for (char c : str.toCharArray ()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
