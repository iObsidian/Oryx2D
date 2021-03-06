package rotmg.account.core;

/**
 * 10% match (very loose implementation for debugging)
 */
public class WebAccount implements Account {

    public static final String NETWORKNAME = "rotmg";
    public static final String WEBUSERID = "";
    public static final String WEBPLAYPLATFORMNAME = "rotmg";

    public String signedRequest = "";
    public String kabamId = "";

    public boolean isVerifiedEmail = true;
    public String platformToken = "";
    public String userDisplayName = "";

    public String entryTag = "";
    public boolean rememberMe = true;
    public String paymentProvider = "";
    public String paymentData = "";
    public String userId = "";
    public String password = "";
    public String token = "";
    public String secret = "";
    public Object credentials;
    public String gameNetworkUserId = "";
    public String gameNetwork = "";
    public String playPlatform = "";
    String userName = "";
    boolean isRegistered;
    String requestPrefix = "";
    boolean isVerified = true;

    String moneyUserId = "";

    String moneyAccessToken = "";

    public WebAccount() {
        super();
    }

    public static WebAccount instance;

    public WebAccount(String email, String password) {
        this.userId = email;
        this.password = password;
    }

    public static void setInstance(WebAccount inst) {
        instance = inst;
    }

    public static Account getInstance() {
        WebAccount account = new WebAccount("fliphcc@gmail.com", "ati3SmaQ3de");
        account.secret = account.password;
        return account;
    }

    @Override
    public String getUserName() {
        return this.userId;
    }

    @Override
    public String getUserId() {
        if (this.userId == null) {
            //this.userId = GUID.create();
        }
        return this.userId;
    }

    @Override
    public String getPassword() {

        if (this.password != null) {
            return this.password;
        } else {
            return "";
        }

    }

    @Override
    public String getToken() {
        return "";
    }

    @Override
    public boolean isRegistered() {
        return true;
    }

    @Override
    public void updateUser(String param1, String param2, String param3) {
        /**   SharedObject loc4 = null;
         this.userId = param1;
         this.password = param2;
         this.token = param3;
         try {
         if (this.rememberMe) {
         loc4 = SharedObject.getLocal("RotMG", "/");
         loc4.stats["GUID"] = param1;
         loc4.stats["Token"] = param3;
         loc4.stats["Password"] = param2;
         loc4.flush();
         }
         return;
         }
         catch (error:Error) {
         return;
         }*/
    }

    @Override
    public void clear() {
        this.rememberMe = true;
        //this.updateUser(GUID.create(), null, null);
		/*Parameters.sendLogin = true;
		Parameters.stats.charIdUseMap={};

		Parameters.save();**/
    }

    @Override
    public void reportIntStat(String param1, int param2) {
    }

    @Override
    public String getRequestPrefix() {
        return "/credits";
    }

    @Override
    public String gameNetworkUserId() {
        return WEBUSERID;
    }

    @Override
    public String gameNetwork() {
        return NETWORKNAME;
    }

    @Override
    public String playPlatform() {
        return WEBPLAYPLATFORMNAME;
    }

    @Override
    public String getEntryTag() {
        if (this.entryTag != null) {
            return this.entryTag;
        } else {
            return "";
        }
    }

    @Override
    public String getSecret() {
        return "";
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public void verify(boolean param1) {
        this.isVerifiedEmail = param1;
    }

    @Override
    public boolean isVerified() {
        return this.isVerifiedEmail;
    }

    @Override
    public String getPlatformToken() {

        if (this.platformToken != null) {
            return this.platformToken;
        } else {
            return "";
        }

    }

    @Override
    public void setPlatformToken(String param1) {
        this.platformToken = param1;
    }

    @Override
    public String getMoneyAccessToken() {
        return this.signedRequest;
    }

    @Override
    public String getMoneyUserId() {
        return this.kabamId;
    }

    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public void setUserDisplayName(String param1) {
        this.userDisplayName = param1;
    }

    public boolean getRememberMe() {
        return this.rememberMe;
    }

    public void setRememberMe(boolean param1) {
        this.rememberMe = param1;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    public void setPaymentProvider(String param1) {
        this.paymentProvider = param1;
    }

    public String getPaymentData() {
        return this.paymentData;
    }

    public void setPaymentData(String param1) {
        this.paymentData = param1;
    }


}
