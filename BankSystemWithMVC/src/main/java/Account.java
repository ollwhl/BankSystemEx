/*
+=====================================+
|       Name: Wan FuRin               |
| StudentNum: 316541                  |                    |
+=====================================+
*/
public class Account {
	private String name; /* 口座名 */
	private String password;
    private int balance; /* 口座の残高 */

    public Account(String myName,int myBalance,String myPassword/* 口座名 */) { 
    	this.name=myName;
    	this.password=myPassword;
    	this.balance=myBalance;
    } /* コンストラクタ　*/
	public int deposit(int amount/* 預金額 */) { 
    	if(amount<=0) {
    		return -3;
    	}else {
            balance+=amount;
    	    return 0;
    	}
    } /* 預金 */
    public int withdraw(int amount/* 出金額 */) { 
    	if(amount>balance) {
    		return -1;
    	}else if(amount<=0){
    		return -3;
    	}else {
    		balance-=amount;
    		return 0;
    	}
    } /* 払い戻し*/
    public int showBalance() {
    	/* 残高照会 */
    	return balance;
    }
    public String getPassword() {
    	return password;
    }
    public int login(String myPassword) {
    	if(myPassword==password) {
    		return 0;
    	}else {
    		return -8;
    	}
    }
    public void setPassword(String myPassword) {
    	password=myPassword;
    }
    public String getName() {
    	return name;
    }
}
