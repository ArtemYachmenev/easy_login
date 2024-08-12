import java.util.HashMap;

public class IDandPass {
    HashMap<String,String> logininfo=new HashMap<>();
    IDandPass(){
        logininfo.put("bro","123");
        logininfo.put("art","111");
        logininfo.put("mark","222");
    }

    protected HashMap<String, String> getLoginInfo(){
        return logininfo;
    }

    public IDandPass(HashMap<String, String> logininfo) {
        this.logininfo = logininfo;
    }
}
